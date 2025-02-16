package streamAPI;

public class Person {
    private String name;
    private Integer age;
    private String cityName;

    public Person(String name, Integer age, String cityName) {
        this.name = name;
        this.age = age;
        this.cityName = cityName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cityName='" + cityName + '\'' +
                '}';
    }
}
