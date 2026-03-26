package net.charaf.metier;

import net.charaf.dao.IDao;

/**
 * @author $ {USER}
 **/
public class MetierImpl implements IMetier {

    IDao dao;

    public MetierImpl(IDao dao){
        this.dao=dao;
    }
    @Override
    public double calcul(){
        System.out.println("MetierImpl : calcul().");
        return this.dao.getData() * 1.5 +20;
    }
}
