/*
 * @Coding: utf-8 \n
 * @Despcription:  \n
 * @Author: Suwen SP \n
 * @LastEditors: Suwen SP\n
 * @Date: 2019-03-18 19:08:32
 * @LastEditTime: 2019-03-18 19:09:37
 */
public class Piano extends Instrument {
    public int keyNum;

    Piano() {
    }

    Piano(String name, String band, int keyNum) {
        super(name, band);
        this.keyNum = keyNum;
    }

    public void Play() {
        System.out.println("play piano");
    }
}