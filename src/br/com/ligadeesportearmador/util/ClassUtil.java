/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ligadeesportearmador.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.beanutils.BeanUtils;

/**
 *
 * @author rut1
 */
public class ClassUtil {

    public static boolean existsClass(String className){
        try {
            Class.forName(className);
            return true;
        } catch (ClassNotFoundException ex) {
            return false;
        }
    }

    public final static void set(Object objForCall, String attrName, Object setValue){
        try {
            Method call = getAttributeSetter(objForCall.getClass(), attrName, setValue.getClass());
            call.invoke(objForCall, new Object[]{setValue});
        } catch (IllegalAccessException ex) {
            throw new Exception(ex);
        } catch (IllegalArgumentException ex) {
            throw new Exception(ex);
        } finally{
            return;
        }
    }

    public final static Object get(Object objForCall, String attrName){
        Object returnedObj = null;
        try {
            Method call = getAttributeGetter(objForCall.getClass(), attrName);
            returnedObj = call.invoke(objForCall, new Object[]{});
        } catch (IllegalAccessException ex) {
            throw new Exception(ex);
        } catch (IllegalArgumentException ex) {
            throw new Exception(ex);
        } finally{
            return returnedObj;
        }
    }

    public final static Object createObject(String className) {
      Object object = null;
      try {
          Class classDefinition = Class.forName(className);
          object = classDefinition.newInstance();
      } catch (InstantiationException ex) {
          throw new Exception(ex);
      } catch (IllegalAccessException ex) {
          throw new Exception(ex);
      } catch (ClassNotFoundException ex) {
          throw new Exception(ex);
      } finally{
          return object;
      }
   }

    public final static Object createObject(Class classDefinition) {
      Object object = null;
      try {
          object = classDefinition.newInstance();
      } catch (InstantiationException ex) {
          throw new Exception(ex);
      } catch (IllegalAccessException ex) {
          throw new Exception(ex);
      } finally{
          return object;
      }
   }

    /**
   * Returns attribute's getter method. If the method not found then
   * NoSuchMethodException will be thrown.
   *
   * @param cls
   *          the class the attribute belongs too
   * @param attr
   *          the attribute's name
   * @return attribute's getter method
   * @throws NoSuchMethodException
   *           if the getter was not found
   */
    public final static Method getAttributeGetter(Class cls, String attr){
        StringBuffer buf = new StringBuffer(attr.length() + 3);
        buf.append("get");
        if (Character.isLowerCase(attr.charAt(0))) {
            buf.append(Character.toUpperCase(attr.charAt(0))).append(attr.substring(1));
        } else {
            buf.append(attr);
        }

        try {
            return cls.getMethod(buf.toString(), (Class[]) null);
        } catch (NoSuchMethodException e) {
            try {
                buf.replace(0, 3, "is");
                return cls.getMethod(buf.toString(), (Class[]) null);
            } catch (NoSuchMethodException ex) {
                return null;
            }
        }
    }

   /**
   * Returns attribute's setter method. If the method not found then
   * NoSuchMethodException will be thrown.
   *
   * @param cls
   *          the class the attribute belongs to
   * @param attr
   *          the attribute's name
   * @param type
   *          the attribute's type
   * @return attribute's setter method
   * @throws NoSuchMethodException
   *           if the setter was not found
   */
    public final static Method getAttributeSetter(Class cls, String attr, Class type){
        try {
            StringBuffer buf = new StringBuffer(attr.length() + 3);
            buf.append("set");
            if (Character.isLowerCase(attr.charAt(0))) {
                buf.append(Character.toUpperCase(attr.charAt(0))).append(attr.substring(1));
            } else {
                buf.append(attr);
            }
            return cls.getMethod(buf.toString(), new Class[]{type});
        } catch (NoSuchMethodException ex) {
            return null;
        } 
    }

    public static Set getBeanGetters(Class beanClass){
        Set beanGetters = null;
        try {
            Object o = createObject(beanClass);
            if(o != null){
                Map beanMap = BeanUtils.describe(o);
                beanGetters = beanMap.keySet();
            }
        } catch (IllegalAccessException ex) {
            throw new Exception(ex);
        } catch (InvocationTargetException ex) {
            throw new Exception(ex);
        } catch (NoSuchMethodException ex) {
            throw new Exception(ex);
        } finally {
            return beanGetters;
        }
    }

    public static List<MethodDescriptor> getBeanGettersAliasName(Class beanClass){
        List<MethodDescriptor> beanMappedMethods = null;
        Set getters = getBeanGetters(beanClass);
        if(getters != null){
            beanMappedMethods = new ArrayList<MethodDescriptor>();
            for(Object getter : getters){
                String getterAlias = getAttributeGetterAliasName(beanClass, getter.toString());
                if(getterAlias != null){
                    MethodDescriptor met = new MethodDescriptor(beanClass, getter.toString(), getterAlias);
                    beanMappedMethods.add(met);
                }
            }
            CollectionsUtils.sortListAsc(beanMappedMethods, MethodDescriptor.class, "methodAliasName", true);
        }
        return beanMappedMethods;
    }

    public static String getAttributeGetterAliasName(Class beanClass, String getterMethod){
        Method mm = ClassUtil.getAttributeGetter(beanClass, getterMethod);
        if(mm != null){
            Object ann = mm.getAnnotation(GroupBeanMethodAttributes.class);
            if(ann != null){
                if(!((GroupBeanMethodAttributes)ann).isTransient())
                    return ((GroupBeanMethodAttributes)ann).value();
                else{
                    return null;
                }
            }else{
                return getterMethod;
            }
        }else{
            return null;
        }
    }

    public static class MethodDescriptor{
        private Class beanClass;
        private String methodName;
        private String methodAliasName;

        public MethodDescriptor(Class beanClass, String methodName, String methodAliasName) {
            this.beanClass = beanClass;
            this.methodName = methodName;
            this.methodAliasName = methodAliasName;
        }

        public Class getBeanClass() {
            return beanClass;
        }

        public void setBeanClass(Class beanClass) {
            this.beanClass = beanClass;
        }

        public String getMethodAliasName() {
            return methodAliasName;
        }

        public void setMethodAliasName(String methodAliasName) {
            this.methodAliasName = methodAliasName;
        }

        public String getMethodName() {
            return methodName;
        }

        public void setMethodName(String methodName) {
            this.methodName = methodName;
        }

        @Override
        public String toString() {
            return getMethodAliasName();
        }

    }
    
    public static Object cloneObject(Object obj) {    
        Object clone = null;
        try {
            clone = BeanUtils.cloneBean(obj);
        } catch (IllegalAccessException ex) {
            throw new Exception(ex);
        } catch (InstantiationException ex) {
            throw new Exception(ex);
        } catch (InvocationTargetException ex) {
            throw new Exception(ex);
        } catch (NoSuchMethodException ex) {
            throw new Exception(ex);
        } finally{
            return clone;
        }
    }

}
