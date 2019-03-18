/*
 * @Coding: utf-8 \n
 * @Despcription:  \n
 * @Author: Suwen SP \n
 * @LastEditors: Suwen SP\n
 * @Date: 2019-03-18 19:09:18
 * @LastEditTime: 2019-03-18 19:10:28
 */
public class Accord extends Instrument {
    public int keyNum;

    Accord() {
    }

    Accord(String name, String band, int keyNum) {
        super(name, band);
        this.keyNum = keyNum;
    }

    public void Play() {
        System.out.println("play Accord");
    }
}