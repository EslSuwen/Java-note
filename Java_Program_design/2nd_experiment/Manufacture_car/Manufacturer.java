/*
 * @Coding: utf-8 \n
 * @Despcription:  \n
 * @Author: Suwen \n
 * @LastEditors: Suwen SP\n
 * @Date: 2019-03-04 19:24:43
 * @LastEditTime: 2019-03-26 09:25:43
 */
package exp2.manufacture_car;

class Manufacturer {
    public static void assemble(Engine e, Frame f, Wheel[] w) {
        System.out.println("An automobile has been assembled");
    }

    public static void main(String[] args) {
        Wheel[] wheels = new Wheel[4];
        Engine engine = new Engine();
        Frame frame = new Frame();
        assemble(engine, frame, wheels);
    }
}