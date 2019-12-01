package lesson6;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class BeanUtils {
    public void assign (Object to, Object from) throws Exception {
        //System.out.println("START");

        for (Method getm : from.getClass().getMethods()) {
            String gName = getm.getName();
            if (null != isGetter(getm)) {
                //System.out.println("getter:" + gName);
                for (Method setm : to.getClass().getMethods()) {
                    String sName = setm.getName();
                    if (null != isSetter(setm) && isSetter(setm).equals(isGetter(getm))) {
                        //System.out.println("setter:" + sName);
                        try {
                            Object g = getm.invoke(from, getm.getParameters());
                            //System.out.println(g);
                            setm.invoke(to, g);
                        } catch (InvocationTargetException e) {
                            System.out.println("InvocationTargetException");
                        } catch (IllegalAccessException e) {
                            System.out.println("IllegalAccessException");
                        } catch (IllegalArgumentException e) {
                            System.out.println("Cannot assign non-compatible parameter: "+from.getClass()+", method:" +getm.getName() + ", type: " +getm.getReturnType());
                        }
                    }
                }
            }
        }

    }private static String isGetter(Method method){
        // identify get methods
        if(method.getName().startsWith("get") && method.getParameterCount() == 0 && !method.getReturnType().equals(void.class)){
            return method.getName().replace("get","");
        }
        return null;
    }

    private static String isSetter(Method method){
        // identify set methods
        if(method.getName().startsWith("set") && method.getParameterCount() == 1 && method.getReturnType().equals(void.class)){
            return method.getName().replace("set","");
        }
        return null;
    }
}
