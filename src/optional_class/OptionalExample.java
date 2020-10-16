package optional_class;

import java.util.Comparator;
import java.util.Optional;

class Frined{
    String name;
    Optional<Company> cmp; // null일 수 있다.

    public Frined(String n , Optional<Company> c){
        name = n;
        cmp = c;
    }

    public String getName(){
        return name;
    }

    public Optional<Company> getCmp(){
        return cmp;
    }
}

class Company{
    String cName;
    Optional<PersonInfo> cInfo; // null일 수 있다.

    public Company(String cn, Optional<PersonInfo> pi){
        cName = cn;
        cInfo = pi;
    }

    public String getcName(){
        return cName;
    }

    public Optional<PersonInfo> getpInfo(){
        return cInfo;
    }
}

class PersonInfo{
    Optional<String> phone; // null 일 수 있다.
    Optional<String> adrs; // null일 수 있다.

    public PersonInfo(Optional<String> ph, Optional<String> ad){
        phone = ph;
        adrs = ad;
    }

    public Optional<String> getPhone(){
        return phone;
    }

    public Optional<String> getAdrs(){
        return adrs;
    }
}


public class OptionalExample {
    public static void showCompAddr(Optional<Frined> f){
        String addr = f.flatMap(Frined::getCmp) // if ~ else 문 없이 구현했다. 코드가 간결하고 가독성이 좋다.
                .flatMap(Company::getpInfo)
                .flatMap(PersonInfo::getAdrs)
                .orElse("There's no address information.");

        System.out.println("주소 : " + addr);
    }

    public static void main(String[] args) {
        //Optional<PersonInfo> pi = Optional.of(new PersonInfo(Optional.ofNullable(null), Optional.ofNullable(null)));
        Optional<PersonInfo> pi = Optional.of(new PersonInfo(Optional.ofNullable(null), Optional.of("서울시 도봉구 방학 2동")));
        Optional<Company> cp = Optional.of(new Company("YaHo co., Ltd.", pi));
        Optional<Frined> frn = Optional.of(new Frined("LEE SU", cp));
        showCompAddr(frn);
    }
}
