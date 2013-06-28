/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ligadeesportearmador.util;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimaps;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import org.apache.commons.beanutils.BeanComparator;
import org.apache.commons.collections.Transformer;
import org.apache.commons.collections.comparators.ComparableComparator;
import org.apache.commons.collections.comparators.ComparatorChain;
import org.apache.commons.collections.comparators.NullComparator;
import org.apache.commons.collections.comparators.ReverseComparator;
import org.apache.commons.collections.comparators.TransformingComparator;

/**
 *
 * @author rut1
 */
public class CollectionsUtils {

    // *************************** SORT BY UTIL ***********************************

    public static Comparator getOrderByAscComparator(Class beanClass, String getterMethod, boolean isNullsFirst){
        Comparator c = null;
        if(beanClass != null && getterMethod != null && !getterMethod.trim().equals("")){
            Method getter = ClassUtil.getAttributeGetter(beanClass, getterMethod);
            if(getter != null){
                Class returnType = getter.getReturnType();
                if(returnType == String.class){
                    c = new BeanComparator(getterMethod, getStringComparator(new NullComparator(!isNullsFirst)));
                }else{
                    c = new BeanComparator(getterMethod, new NullComparator(!isNullsFirst));
                }
            }
        }
        return c;
    }

    public static Comparator getOrderByDescComparator(Class beanClass, String getterMethod, boolean isNullsFirst){
        Comparator c = null;
        if(beanClass != null && getterMethod != null && !getterMethod.trim().equals("")){
            Method getter = ClassUtil.getAttributeGetter(beanClass, getterMethod);
            if(getter != null){
                Class returnType = getter.getReturnType();
                if(returnType == String.class){
                    c = new BeanComparator(getterMethod, getStringComparator(new NullComparator(new ReverseComparator(new ComparableComparator()), !isNullsFirst)));
                }else{
                    c = new BeanComparator(getterMethod, new NullComparator(new ReverseComparator(new ComparableComparator()), !isNullsFirst));
                }
            }
        }
        return c;
    }

    public static void sortList(List objectList, List<Comparator> comparators){
        if(objectList!= null && !objectList.isEmpty() && comparators != null && !comparators.isEmpty()){
            ComparatorChain cc = new ComparatorChain();
            for (Comparator comparator : comparators) {
                if(comparator != null)
                    cc.addComparator(comparator);
            }
            Collections.sort(objectList, cc);
        }
    }

    public static void sortList(List objectList, Comparator... comparators){
        sortList(objectList, Arrays.asList(comparators));
    }

    public static void sortList(List objectList, Comparator comparator){
        if(objectList!= null && !objectList.isEmpty() && comparator != null){
            ComparatorChain cc = new ComparatorChain();
            cc.addComparator(comparator);
            Collections.sort(objectList, cc);
        }
    }

    public static void sortListAsc(List objectList, Class beanClass, String getterMethod, boolean isNullsFirst){
        if(objectList!= null && !objectList.isEmpty() && beanClass != null && getterMethod != null && !getterMethod.trim().equals("")){
            Comparator sortAsc = getOrderByAscComparator(beanClass, getterMethod, isNullsFirst);
            if(sortAsc != null){
                ComparatorChain cc = new ComparatorChain();
                cc.addComparator(sortAsc);
                Collections.sort(objectList, cc);
            }
        }
    }

    public static void sortListDesc(List objectList, Class beanClass, String getterMethod, boolean isNullsFirst){
        if(objectList!= null && !objectList.isEmpty() && beanClass != null && getterMethod != null && !getterMethod.trim().equals("")){
            Comparator sortDesc = getOrderByDescComparator(beanClass, getterMethod, isNullsFirst);
            if(sortDesc != null){
                ComparatorChain cc = new ComparatorChain();
                cc.addComparator(sortDesc);
                Collections.sort(objectList, cc);
            }
        }
    }

    public static void sortListAscNullsFirst(List objectList, Class beanClass, List<String> gettersMethod){
        sortList(objectList, beanClass, gettersMethod, true, true);
    }

    public static void sortListAscNullsLast(List objectList, Class beanClass, List<String> gettersMethod){
        sortList(objectList, beanClass, gettersMethod, true, false);
    }

    public static void sortListDescNullsFirst(List objectList, Class beanClass, List<String> gettersMethod){
        sortList(objectList, beanClass, gettersMethod, false, true);
    }

    public static void sortListDescNullsLast(List objectList, Class beanClass, List<String> gettersMethod){
        sortList(objectList, beanClass, gettersMethod, false, false);
    }

    private static void sortList(List objectList, Class beanClass, List<String> gettersMethod, boolean isOrderAsc, boolean isNullsFirst){
        if(gettersMethod != null && !gettersMethod.isEmpty()){
            List<Comparator> listOrderBy = new ArrayList<Comparator>();
            for(String group : gettersMethod){
                Comparator orderBy = null;
                if(isOrderAsc)
                    orderBy = getOrderByAscComparator(beanClass, group, isNullsFirst);
                else
                    orderBy = getOrderByDescComparator(beanClass, group, isNullsFirst);
                if(orderBy != null){
                    listOrderBy.add(orderBy);
                }
            }
            sortList(objectList, listOrderBy);
        }
    }

    private static Comparator getStringComparator(Comparator decorated){
        Transformer transformer = new Transformer() {
            public Object transform(Object input) {
                if(input instanceof String){
                    if(input != null) {
                        if(input.toString() != null && !input.toString().trim().equals("")){
                            return input;
                        }else{
                            return null;
                        }
                    }else{
                        return null;
                    }
                }
                return input;
            }
        };
        Comparator comparator = new TransformingComparator(transformer, decorated);
        return comparator;
    }


    // *************************** GROUP BY UTIL ***********************************


    private static final String GROUP_EMPTY_CASES = "<VAZIO>";

    public static class GroupNode<T>{
        private GroupNode<T> nodeParent;
        private List<GroupNode<T>> nodeChildrens;
        private Object nodeKey;
        private String groupLevelOrderName;
        private Collection<T> nodeValues;

        public GroupNode(GroupNode<T> nodeParent, Object nodeKey, Collection<T> nodeValues, String groupLevelOrderName) {
            this.nodeParent = nodeParent;
            this.nodeKey = nodeKey;
            this.nodeValues = nodeValues;
            this.groupLevelOrderName = groupLevelOrderName;
        }

        public String getGroupLevelOrderName() {
            return groupLevelOrderName;
        }

        public void setGroupLevelOrderName(String groupLevelOrderName) {
            this.groupLevelOrderName = groupLevelOrderName;
        }

        public List<GroupNode<T>> getNodeChildrens() {
            if(nodeChildrens == null)
                nodeChildrens = new ArrayList<GroupNode<T>>();
            return nodeChildrens ;
        }

        public void setNodeChildrens(List<GroupNode<T>> nodeChildrens) {
            this.nodeChildrens = nodeChildrens;
        }

        public Object getNodeKey() {
            return nodeKey;
        }

        public void setNodeKey(Object nodeKey) {
            this.nodeKey = nodeKey;
        }

        public GroupNode<T> getNodeParent() {
            return nodeParent;
        }

        public void setNodeParent(GroupNode<T> nodeParent) {
            this.nodeParent = nodeParent;
        }

        public Collection<T> getNodeValues() {
            return nodeValues;
        }

        public void setNodeValues(Collection<T> nodeValues) {
            this.nodeValues = nodeValues;
        }

        @Override
        public String toString() {
            return getNodeKey().toString();
        }
    }

    public static <T> List<GroupNode<T>> getGroupByList(List<T> objectList, Class beanClass, List<String> gettersMethodAsGroupListOrder){
        List<GroupNode<T>> groupedList = new ArrayList<GroupNode<T>>();
        if(gettersMethodAsGroupListOrder != null && !gettersMethodAsGroupListOrder.isEmpty()){
            removeNonExistsGettersFromBean(beanClass, gettersMethodAsGroupListOrder);
            sortListAscNullsFirst(objectList, beanClass, gettersMethodAsGroupListOrder);
            if(!gettersMethodAsGroupListOrder.isEmpty()){
                GroupNode<T> nodeParent = null;
                String getterMethodAsFirstGroup = gettersMethodAsGroupListOrder.get(0);
                ImmutableMultimap currentGroupNodeMap = createGroupMap(objectList, beanClass, getterMethodAsFirstGroup);
                for(Object currentGroupNodeKey : currentGroupNodeMap.keySet()){
                    GroupNode<T> nodeChild = new GroupNode<T>(nodeParent, currentGroupNodeKey, currentGroupNodeMap.get(currentGroupNodeKey), getterMethodAsFirstGroup);
                    groupByAction(nodeChild, gettersMethodAsGroupListOrder, beanClass, getterMethodAsFirstGroup);
                    groupedList.add(nodeChild);
                }
            }
        }
        return groupedList;
    }

    private static <T> void groupByAction(GroupNode<T> nodeParent, List<String> gettersMethodAsGroupListOrder, Class beanClass, String getterMethodAsParentGroupOrder){

        if(!hasNextGroupOrder(gettersMethodAsGroupListOrder, getterMethodAsParentGroupOrder)){
            //System.out.println("call - "+parentGroupOrder +" - to - "+nodeParent.getNodeKey()+" - i'm a leaf");
            return;
        }else{
            String getterMethodAsCurrentGroupOrder = getNextGroupOrder(gettersMethodAsGroupListOrder, getterMethodAsParentGroupOrder);
            ImmutableMultimap currentGroupNodeMap = createGroupMap((List<T>) nodeParent.getNodeValues(), beanClass, getterMethodAsCurrentGroupOrder);
            for(Object currentGroupNodeKey : currentGroupNodeMap.keySet()){
                GroupNode<T> nodeChild = new GroupNode<T>(nodeParent, currentGroupNodeKey, currentGroupNodeMap.get(currentGroupNodeKey), getterMethodAsCurrentGroupOrder);
                //System.out.println("call - "+parentGroupOrder +" - to - "+nodeParent.getNodeKey()+" - child is - "+nodeChild.getNodeKey());
                groupByAction(nodeChild, gettersMethodAsGroupListOrder, beanClass, getterMethodAsCurrentGroupOrder);
                nodeParent.getNodeChildrens().add(nodeChild);
            }
        }
    }

    public static <T> DefaultTreeModel getGroupByTreeModel(List<T> objectList, Class beanClass, List<String> gettersMethodAsGroupListOrder){
        List<GroupNode<T>> objList = getGroupByList(objectList, beanClass, gettersMethodAsGroupListOrder);
        return getGroupByTreeModel(objList, gettersMethodAsGroupListOrder);
    }

    private static <T> DefaultTreeModel getGroupByTreeModel(List<GroupNode<T>> objectList, List<String> gettersMethodAsGroupListOrder){
        DefaultTreeModel groupedList = new DefaultTreeModel(new DefaultMutableTreeNode());
        if(gettersMethodAsGroupListOrder != null && !gettersMethodAsGroupListOrder.isEmpty()){
            if(!gettersMethodAsGroupListOrder.isEmpty()){
                DefaultMutableTreeNode nodeParent = (DefaultMutableTreeNode) groupedList.getRoot();
                groupedList.setRoot(nodeParent);
                String getterMethodAsFirstGroup = gettersMethodAsGroupListOrder.get(0);
                for(GroupNode<T> currentGroupNodeKey : objectList){
                    DefaultMutableTreeNode nodeChild = new DefaultMutableTreeNode(currentGroupNodeKey);
                    groupByActionForTreeModel(nodeChild, currentGroupNodeKey, gettersMethodAsGroupListOrder, getterMethodAsFirstGroup);
                    nodeParent.add(nodeChild);
                }
            }
        }
        return groupedList;
    }

    private static <T> void groupByActionForTreeModel(DefaultMutableTreeNode nodeParent, GroupNode<T> groupNodeParent, List<String> gettersMethodAsGroupListOrder, String getterMethodAsParentGroupOrder){

        if(!hasNextGroupOrder(gettersMethodAsGroupListOrder, getterMethodAsParentGroupOrder)){
            return;
        }else{
            String getterMethodAsCurrentGroupOrder = getNextGroupOrder(gettersMethodAsGroupListOrder, getterMethodAsParentGroupOrder);
            for(GroupNode<T> currentGroupNodeKey : groupNodeParent.getNodeChildrens()){
                DefaultMutableTreeNode nodeChild = new DefaultMutableTreeNode(currentGroupNodeKey);
                groupByActionForTreeModel(nodeChild, currentGroupNodeKey, gettersMethodAsGroupListOrder, getterMethodAsCurrentGroupOrder);
                nodeParent.add(nodeChild);
            }
        }
    }

    private static void removeNonExistsGettersFromBean(Class beanClass, List<String> gettersMethodAsGroupListOrder){
        if(gettersMethodAsGroupListOrder != null && !gettersMethodAsGroupListOrder.isEmpty()){
            List<String> nonExistsGroupForBean = new ArrayList<String>();
            for(String group : gettersMethodAsGroupListOrder){
                Method getter = ClassUtil.getAttributeGetter(beanClass, group);
                if(getter == null){
                    nonExistsGroupForBean.add(group);
                }
            }
            for(String removeGroup : nonExistsGroupForBean){
                gettersMethodAsGroupListOrder.remove(removeGroup);
            }
        }
    }

    private static boolean hasNextGroupOrder(List<String> gettersMethodAsGroupListOrder, String getterMethodAsCurrentGroup){
        for (Iterator<String> it = gettersMethodAsGroupListOrder.iterator(); it.hasNext();) {
            String string = it.next();
            if(string.equals(getterMethodAsCurrentGroup) && it.hasNext()){
                return true;
            }
        }
        return false;
    }

    private static String getNextGroupOrder(List<String> gettersMethodAsGroupListOrder, String getterMethodAsCurrentGroup){
        for (Iterator<String> it = gettersMethodAsGroupListOrder.iterator(); it.hasNext();) {
            String string = it.next();
            if(string.equals(getterMethodAsCurrentGroup) && it.hasNext()){
                return it.next();
            }
        }
        return "";
    }

    private static ImmutableMultimap createGroupMap(List list, final Class beanClass, final String getterMethodAsGroupName){
        return Multimaps.index(list, new Function<Object, Object>() {
            public Object apply(Object doc) {
                Object getterReturnValue = ClassUtil.get(doc, getterMethodAsGroupName);
                Method getter = ClassUtil.getAttributeGetter(beanClass, getterMethodAsGroupName);
                if (getter.getReturnType() == Date.class) {
                    if(getterReturnValue != null && getterReturnValue.toString() != null){
                        return DateUtil.getData((Date) getterReturnValue);
                    }else{
                        return GROUP_EMPTY_CASES;
                    }
                }else {
                    return getterReturnValue != null 
                            && getterReturnValue.toString() != null
                            && !getterReturnValue.toString().equals("") ? getterReturnValue.toString() : GROUP_EMPTY_CASES;
                }
            }
        });
    }

    public static <T> void showGroupedValues(List<GroupNode<T>> groupedNodeList){
        showGroupedValues(groupedNodeList, "");
    }

    private static <T> void showGroupedValues(List<GroupNode<T>> groupedNodeList, String initialLevelString){
        for(GroupNode<T> node : groupedNodeList){
            System.out.println(initialLevelString+"Group Level: "+node.getGroupLevelOrderName()+" - "+node.getNodeKey()+" - Count: "+node.getNodeValues().size() +" - NºChilds: "+node.getNodeChildrens().size());
            showGroupedValues(node.getNodeChildrens(),initialLevelString+"    ");
        }
    }

}
