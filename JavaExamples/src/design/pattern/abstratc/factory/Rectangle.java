package design.pattern.abstratc.factory;

/**
 * 2、创建实现接口的形状实体类Rectangle
 * Created by luosv on 2017/12/5 0005.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
