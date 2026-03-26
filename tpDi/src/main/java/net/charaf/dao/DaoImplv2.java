package net.charaf.dao;

/**
 * @author $ {USER}
 **/
public class DaoImplv2 implements IDao{
    @Override
    public double getData(){
        System.out.println("DaoImplv2 : getData() , ");
        return 10;
    }
}
