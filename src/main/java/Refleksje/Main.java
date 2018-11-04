package Refleksje;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
//dostanie sie za pomoca standardowe podejscie
        Data myObject = new Data();
        String name = myObject.returnName("tomasz techno bango");

        System.out.println(name);

//dostanie sie za pomoca refleksji
        try {
            Class myClass = Class.forName("Refleksje.Data");
            for (Method m : myClass.getMethods()) {//get.methods wypisuje nam tylko 'publiczne metody'
                for (Class c : m.getParameterTypes()) {
                    System.out.println("nazwa metody: " + m.getName() + ", parametr: " + c.getName());

                }
            }



            Object constructor = myClass.newInstance();
            Method funcion = constructor.getClass().getMethod("returnName", String.class);

            Object wynik = funcion.invoke(constructor, "Tomasz techno bang");

            System.out.println(wynik);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
