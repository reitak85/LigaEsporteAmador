/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ligadeesportearmador.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.lang.time.DateUtils;

/**
 *
 * @author rut1
 */
public class DateUtil {

    public static java.sql.Date sqlDateWrapper(Date dt){
        return new java.sql.Date(dt.getTime());
    }

    public static String horarioAtual(){
        DateFormat df1 = new SimpleDateFormat("hh:mm a");
        return df1.format(new Date());
    }

    public static String getData(Date data){
        DateFormat df1 = new SimpleDateFormat("dd/MM/yyyy");
        return data != null ? df1.format(data) : "";
    }

    public static String getDataWithHour(Date data){
        DateFormat df1 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aaa");
        return data != null ? df1.format(data) : "";
    }

    public static String getDataAtual(){
        DateFormat df1 = new SimpleDateFormat("dd/MM/yyyy");
        return df1.format(new Date());
    }

    public static String getDataAtualSearch(){
        DateFormat df1 = new SimpleDateFormat("dd/MM/yy");
        return df1.format(new Date());
    }

    public static String getDataSQL(Date data){
        DateFormat df1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return data != null ? "to_date('"+df1.format(data)+"','DD/MM/YYYY HH24:MI:SS')" : "''";
    }

    public static String getDataSQL(String data){
        return data != null && data.trim().compareTo("") != 0 ? "to_date('"+data+" 00:00:00','DD/MM/YYYY HH24:MI:SS')" : "''";
    }

    public static String getDataAtualSQL(){
        DateFormat df1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return "to_date('"+df1.format(new Date())+"','DD/MM/YYYY HH24:MI:SS')";
    }

    public static String getDataFolderModel(String data){
        if(data.trim().compareTo("")==0)
            return "";
        else{
            try {
                DateFormat df1 = new SimpleDateFormat("dd/MM/yyyy");
                Date date = df1.parse(data);
                DateFormat df_folder = new SimpleDateFormat("yyyy_MM_dd");
                return df_folder.format(date);
            } catch (ParseException ex) {
                ex.printStackTrace();
                return "";
            }
        }
    }

    public static String addDaysToDate(String data, int plusDays){
        if(data.trim().compareTo("")==0)
            return "";
        try {
            DateFormat df1 = new SimpleDateFormat("dd/MM/yyyy");
            Date date = df1.parse(data);
            date.setDate(date.getDate() + plusDays); 
            return getData(date);
        } catch (ParseException ex) {
            ex.printStackTrace();
            return "";
        }
    }

    public static long differenceDays(Date date1, Date date2){
        long millisecs2 = date2.getTime();
        long millisecs1 = date1.getTime();
        long diff = millisecs1 - millisecs2;
        long diffDays = diff / (24 * 60 * 60 * 1000);
        return diffDays;
    }

    public static boolean isSameDay(Date date1, Date date2){
        return DateUtils.isSameDay(date1, date2);
    }

}
