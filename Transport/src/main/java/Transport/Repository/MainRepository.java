package Transport.Repository;

public interface MainRepository <Class, Object>
{
    Class create(Class c);
    Class update(Class c);
    void delete (Object obj);
    Class read(Object obj);



}
