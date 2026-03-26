package net.charaf.dao;

/**
 * @author $ {USER}
 **/
public class DaoImpl implements  IDao{
    @Override
    public  double getData(){
        System.out.println("DaoImpl : getData() ,");
        return 20 ;
    }
}
