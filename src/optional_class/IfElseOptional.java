package optional_class;

class ContInfo{
    String phone; // null 일 수 있음
    String adrs; // null 일 수 있음

    public ContInfo(String ph, String ad){
        phone = ph;
        adrs = ad;
    }

    public String getPhone(){
        return phone;
    }

    public String getAdrs(){
        return adrs;
    }
}

public class IfElseOptional {
    public static void main(String[] args) {
        ContInfo ci = new ContInfo(null, "Republic of Korea");
        String phone;
        String addr;

        if(ci.phone != null)
            phone = ci.getPhone();
        else
            phone = "There is no phone number.";

        if(ci.adrs != null)
            addr = ci.getAdrs();
        else
            addr = "There is no address.";

        System.out.println(phone);
        System.out.println(addr);
    }
}

// 멤버가 null인 경우와 null이 아닌 경우의 실행 코드를 구분하려면,
// 위와 같이 if~else 문을 활용해야한다.
// 그러나 Optional 클래스를 활용하면 if ~ else 없이도 이러한 코드를 작성할 수 있다.