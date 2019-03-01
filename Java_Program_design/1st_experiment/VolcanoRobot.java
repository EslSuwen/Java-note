/*
 * @Coding: utf-8 \n
 * @Despcription:  \n
 * @Author: Suwen \n
 * @Date: 2019-02-25 19:28:13
 * @LastEditors: Suwen \n
 * @LastEditTime: 2019-02-25 19:28:47
 */
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
