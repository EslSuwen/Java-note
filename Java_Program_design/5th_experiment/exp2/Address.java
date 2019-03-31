/*
 * @Coding: utf-8 \n
 * @Despcription:  \n
 * @Author: Suwen SP \n
 * @LastEditors: Suwen SP\n
 * @Date: 2019-03-31 12:22:57
 * @LastEditTime: 2019-03-31 12:28:55
 */
class Address {
    private String country;
    private String province;
    private String city;
    private String street;
    private String zipCode;

    Address(String country, String province, String city, String street, String zipCode) {
        this.country = country;
        this.province = province;
        this.city = city;
        this.street = street;
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return country + province + city + street + zipCode;
    }
}