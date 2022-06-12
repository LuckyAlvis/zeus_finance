package com.dai.zeus.finance.server.utils;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayDataDataserviceBillDownloadurlQueryRequest;
import com.alipay.api.response.AlipayDataDataserviceBillDownloadurlQueryResponse;

public class alipayUtils {

    public static void main(String[] args) throws AlipayApiException {
        AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do", "2021003127695864", "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCPWSnAFRnAqpudPM4CuZu+Fbcq1cuDdewBLyYnmMKt9M67mZl99YiLr4IqFDyxBwU1OuccqIIlFJI3cBc6wXbfTqlAAo0EF6uNnV4VGYzlPBL5tH8aF6WlfiSLSy7HnfjvSGlnXrYOZ7HHSMnIf3I8sgLqB+JAcC3PkFHrfBoKsWtBqXbN7aeAGWmzlTlytg47DQfj21774HV42JH7umYCzNfG5B+XmDmO9mRMu1f1qzofiAkQqCB4Mh5YUhQ8Gf57L5DzayImNlvlIb246Lc0amCxHCQtMPR0olA8dFjD9UX91yvklmPpeOl1XGcyZbTwJleLmbbpSTk3+/NWSaCTAgMBAAECggEAeLbYPsZGIoZJd1ceERNmwOMelXbm4/So4rJmyg+NWdp/QWHu7TCYZTFORss19Mn5q8LHns2Uk09IdmDxXuxOg2yFgL7lK54XPLFZ6iDTErPNMvS52CoztzKL6bVNVpKEcFSlVoRegbD29+Am9K3GcLBjXdt3v1X4bgOVyN2APKG546Hu0+24z8qHCFtKtGpnbmd2bc83L1/Dd7XJKH61x8OJsiVKnWoG2Cd/yhPvoWDe60yhkz5XLdgENgb8WTdyFkc2RMqNCUiXiNwLzLueZtSPaUE3EuJJa/D9VDNWRHT8nVTbHR+Bh3xJ7lBgVNLXt/RM+3IAEmsspErM2mI1cQKBgQDQq2S58/8NoosvVCnf0KwUUdTTg8BBxguUwKAVTIDLrBbeAm0K3eikZFKbGhpAw9DMmaAk62YXt1aokutBGFxGQyUpo2GYShSNYPEKNQvtShuUR1zdSM4qEeOQ9bwgV+9PuojDPR2/3Sty5cLtotuu99am/CB7J8LS9mBeM4yBeQKBgQCv3NPAx+UDpX8X0y76d/wgRL6O1OOby4rz/aZukDF/ep8XXiuIeUyOeOMHaHdYMa3lVTPahDEpYDTU8PBOgJyPutRRzHy8BJUZn2EJfh9gEvmB4E1pW0RdUl+hnbo8a+DZIFj6ZjZk1BtSkAP7x4MsmekzMtv357ankgCDZ/XbawKBgFSw633JeQAos4LvDtvHDsBkghOiyponbjXehFqApVmEq/dJVsZtUGnASgKncnZMw2b3BxdU7ye7ApICpzbRU0o1IFUo+YhcsMC80rfI1eFmDZF98UPis8JBZnJEOimKZxed5roPCQ8BDgxhEl9ulOkLr/QwKmKxvZHv6ybwlxtJAoGAF8h2fqjJ6O9Vu8Qco1TcrQR+/NP/oA8r0IlqG6O2ffX4U/GxU3iMCOyCT3sqQKwfR1d5dsDP4TeYjX+0D/nGso1ir1lHOSope9iZB+6dkaGfSpgp/+iO20wLkNDC4e747oQ4ZEy0aHhi5YyCbWdy7vI1nm3vX5xfkFPna94AWtcCgYEAkwQK1XRCUs6IOkArXLtF503KhuK+owVJ/fPqU1hxYE87VfLaln8RLb3I0OhAySjXTG3SJ13osxIHsir834bMj7AK8sNo+uCXqgESTKthXM33QM2UfSO4FREUsVWONndlOT2aomHfI2HWwh04HU/kvSZkA26q213o1GZZN8ETqtQ=", "json", "GBK", "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAoS6wn15wzNe6yNb8lF6NkK13n6GPJvx5dNBz10jGfkfvbSZCMcyidqOkEacn/CgefzkeQ2d+x7qZ76gBt4UW83Fy+/POrZYA5v+RT0TNfuLVAy5AydrZnM90SKGRhhX/WTrT5UVXDf/rKhkaxLw1ewWV0xanXvjpOAK2qvDW/O2G2gmOiFDCKDu7NUuqj0jQmqlVJR7vckv09/Y6Mqi6GYMksvzeWd4x4CAbFCUcGyFza3Co89mlXD9EOZJLCaKXgXYtKPjdzfO1O4alsaJn0XmhBN4SvLaM0kNl7np20Xkm6xlJPpqT+0Jx72/JZGXZFZXIVrlllKadlX7d7V2//wIDAQAB", "RSA2");
        AlipayDataDataserviceBillDownloadurlQueryRequest request = new AlipayDataDataserviceBillDownloadurlQueryRequest();
        request.setBizContent("{" +
                "  \"bill_type\":\"trade\"," +
                "  \"bill_date\":\"2016-04-05\"" +
                "}");
        AlipayDataDataserviceBillDownloadurlQueryResponse response = alipayClient.execute(request);
        if (response.isSuccess()) {
            System.out.println("调用成功");
        } else {
            System.out.println("调用失败");
        }
    }
}
