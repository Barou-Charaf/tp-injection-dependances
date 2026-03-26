package net.charaf.presentation;

import net.charaf.dao.IDao;
import net.charaf.metier.IMetier;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @author $ {USER}
 **/
public class PresentationV2 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new FileReader("config.txt"));

        String daoClassName = bf.readLine();
        Class<?> daoClass = Class.forName(daoClassName);
        IDao daoObj =(IDao)daoClass.getDeclaredConstructor().newInstance();

        String metierClssName = bf.readLine();
      Class<?> metierClass = Class.forName(metierClssName);
       IMetier metierObj =(IMetier)metierClass.getConstructor(IDao.class).newInstance(daoObj);
        System.out.println("Result , dynamic Di  : "+metierObj.calcul());
    }
}
