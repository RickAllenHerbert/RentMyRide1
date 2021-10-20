package za.ac.cput.repository;
/*
    @Description:Repository ->
    @Author: Tyronne Lloyd Hendricks
    @Student Number: 215141210
    @Date: 19 July 2021
*/
@Deprecated
public interface IRepository<Type, ID> {
    Type create(Type t);
    Type read(ID id);
    Type update(Type t);
    boolean delete(ID id);

}
