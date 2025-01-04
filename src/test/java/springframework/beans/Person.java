package springframework.beans;

import springframework.beans.factory.DisposableBean;
import springframework.beans.factory.InitializingBean;

import java.util.Set;

/**
 * @className: Person
 * @author: zhangguowei
 * @date: 2024/12/14 20:42
 * @Version: 1.0
 * @description:
 */
public class Person implements InitializingBean, DisposableBean {

    private String name;

    private int age;

    private Car car;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                '}';
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void customInitMethod(){
        System.out.println("I was born in the method named customInitMethod");
    }

    public void customDestroyMethod(){
        System.out.println("I was born in the method named customDestroyMethod");
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("I was born in the method named destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("I was born in the method named afterPropertiesSet");
    }
}
