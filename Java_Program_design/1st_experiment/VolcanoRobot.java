/*
 * @Coding: utf-8 \n
 * @Despcription:  \n
 * @Author: Suwen \n
 * @Date: 2019-02-25 19:28:13
 * @LastEditors: Suwen SP\n
 * @LastEditTime: 2019-03-26 09:22:52
 */
package exp1;

class VolcanoRobot {
    String status;
    int speed;
    float temperature;

    void checkTemperature() {
        if (temperature > 660) {
            status = "returning home";
            speed = 5;
        }
    }

    void showAttributes() {
        System.out.println("Status: " + status);
        System.out.println("Speed: " + speed);
        System.out.println("Temperature: " + temperature);
    }
}
