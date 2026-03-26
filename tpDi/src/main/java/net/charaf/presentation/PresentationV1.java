package net.charaf.presentation;

import net.charaf.dao.DaoImpl;
import net.charaf.dao.IDao;
import net.charaf.metier.IMetier;
import net.charaf.metier.MetierImpl;
import net.charaf.metier.MetierImplv2;

public class PresentationV1 {
    public static void main(String[] args) {
        IDao daoWithv1 = new DaoImpl();
        IMetier metierObjv2 = new MetierImplv2(daoWithv1);

        System.out.println("Result Using Static Di : "+ metierObjv2.calcul());
    }
}