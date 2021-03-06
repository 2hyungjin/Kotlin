# Kotlin

코틀린에 대한 이해가 부족하고 더 **코틀린 다운 코드**를 짜고 싶어서 코틀린 컴파일러 개발자가 쓴  **"Kotlin In Action"** 책을 읽게 되었습니다.

밑의 내용은 이 책을 읽고 내가 이해하며 정리한 내용이며 더 자세한 내용은 책을 구입하여 읽어보시길 바랍니다.

---

코틀린은 **간결하고 실용적**이며 **자바 코드와의 상호운용성**을 중시한다.

- 코틀린은 **정적 타입 지정 언어**이다. 정적 타입 지정 언어의 장점은 다음과 같다.
  - **성능** : 실행 시점에서 어떤 메소드를 호출할지 알아내는 과정이 필요 없어 메소드 호출이 더 빠르다.
  - **신뢰성** : 컴파일러가 프로그램의 정확성을 검증하여 오류를 줄인다.
  - **유지 보수성** : 코드에서 다루는 객체가 어떤 타입인지 첫 눈에 알 수 있기에 코드를 다루기 쉽게 한다.
  - **도구 지원** : 더 안전하게 리팩토링할 수 있고, 더 정확한 코드 완성기능을 제공할 수 있다.
- 코틀린의 컴파일러는 문맥을 고려하여 변수 타입을 자동으로 결정해준다. 이를 **타입 추론**이라고 부른다.

### 함수형 프로그래밍과 객체지향 프로그래밍

함수형 프로그래밍의 개념은 다음과 같다.

- **일급 객체인 함수** : 함수를 일반 값처럼 다룰 수 있다. 변수에 저장할 수 있고, 인자로 전달할 수 있으며, 함수에서 새로운 함수를 만들어 반환할 수 있다.
- **불변성** : 만들어지면 내부 상태가 절대로 바뀌지 않는 불변 객체를 사용하여 프로그램을 작성한다.
- **부수 효과 없음** : 입력이 같으면 항상 같은 출력을 내놓고 다른 객체의 상태를 변경하지 않으며, 함수 외부나 다른 환경에 상호작용하지 않는 순수 함수를 제공한다.

함수형 프로그래밍의 장점은 다음과 같다.

- **명령형 코드보다 간결하다.** 더 강력한 추상화를 할 수 있으며 이를 통해 코드의 중복을 막을 수 있다.
- **다중 스레드를 사용해도 안전하다.** 불변 데이터 구조를 사용하고 순수 함수를 적용한다면 다중 스레드 환경에서 같은 데이터를 여러 스레드가 변경할 수 없다.
- **테스트가 쉽다.** 순수 함수는 준비 코드(setup code) 없이 독립적으로 테스트할 수 있다.

코틀린은 다음과 같은 방식으로 함수형 프로그래밍을 지원한다.

- **함수 타입을 지원**하여 어떤 함수가 다른 함수를 파라미터로 받거나 함수가 새로운 함수를 반환할 수 있다.
- **람다식을 지원**함에 따라 번거로운 준비 코드를 작성하지 않아도 된다.
- **데이터 클래스**는 불변적인 값 객체를 간편하게 만들 수 있는 구문을 제공한다.
- 코틀린 표준 라이브러리는 객체와 컬랙션을 함수형 스타일로 다룰 수 있는 **API를 제공**한다.

그렇다고 코틀린은 함수형 프로그래밍 방식을 강요하지는 않는다.

### 코틀린의 철학

코틀린은 **실용성, 간결성, 안전성, 상호운용성**의 철학을 갖는다.

#### 실용성

코틀린은 연구를 위한 언어가 아닌 실제 프로젝트를 목표로 만들어졌으며, 특정 프로그래밍 스타일이나 패러다임 사용을 강제하지 않는다.

#### 간결성

코틀린은 여러 가지 번거로운 준비 코드를 묵시적으로 제공하기 때문에 깔끔한 코드를 쓸 수 있다.

또한 다양한 표준 라이브러리를 제공하여 반복되거나 길어질 수 있는 코드를 함수 호출로 대신한다.

**코드가 간결하면 쓰는 데 시간이 덜 걸린다. 중요한 것은 읽는 데도 시간이 덜 걸린다는 점이다.**

#### 안전성

코틀린은 JVM에서 실행되기에 이미 상당한 안정성을 보유한다. 또한 컴파일 시점 검사를 통해 더 많은 오류를 방지한다. 

코틀린은 null이 될 수 없는 값을 추적하며, 실행 시점에 NullPointerException이 발생할 수 있는 연산을 금지한다.

또한 cast에 대해서도 검사하기 때문에 ClassCastException을 방지해주기도 한다.

#### 상호운용성

코틀린은 자바의 기존 라이브러리를 그대로 사용할 수 있다. 코틀린은 다중 언어 프로젝트를 완전히 지원하며 코틀린과 자바가 섞여 있어도 제대로 프로그램을 컴파일할 수 있다.

### 코틀린 코드 컴파일

코틀린 소스코드는 .kt 확장자로 저장된다. 코틀린 컴파일러는 자바 컴파일러와 마찬가지로 코틀린 소스코드를 분석하여 .class파일을 만들어낸다. 만들어진 .class파일은 개발 중인 애플리케이션에 맞는 표준 패키징 과정을 걸쳐 실행될 수 있다.

## 코틀린 기초

코틀린의 기초적인 코드는 자바와 비슷한 흐름으로 짤 수 있다.

**하지만 이런 코드는 "코틀린 다운 코드"라고 부르기는 어렵다.**

### 함수와 변수

```kotlin
fun main(args: Array<String>) {
    println("Hello World")
}
```

- 함수는 fun 키워드를 사용한다
- 파라미터 뒤에 타입을 쓴다.
- **함수를 최상위 수준에 정의할 수 있다. (꼭 클래스 안에 넣어야 할 필요가 없다.)**
- **코틀린 표준 라이브러리는 여러 가지 표준 자바 라이브러리 함수를 간결하게 쓸 수 있도록 래퍼를 제공한다 (ex: System.out.println -> println)**
- 줄 끝에 세미콜론을 붙이지 않아도 된다.

#### 함수

```kotlin
fun 이름(파라미터 : type) : 반환형(없으면 생략 가능){
  함수 바디
}
```

코틀린의 기본적인 함수 모양이다.

#### 문(statement)과 식(expression)의 구분

식은 값을 만들어 내며 다른 식의 하위 요소로 계산에 참여할 수 있지만 

문은 자신을 둘러싸고 있는 가장 안쪽 블록의 최상의 요소로 존재하며 아무런 값을 만들어 내지 않는다.

코틀린에서 if문 등의 제어 구조가 식이므로 값을 만들어 내며 다른 식의 하위 요소로 계산에 참여할 수 있는 반면 자바는 문이기에 그렇지 못하다.

#### 식이 본문인 함수

```kotlin
fun max(a: Int, b: Int):Int=if(a>b) a else b
```

중괄호를 없애고 return 대신 =를 붙여 간결하게 함수를 표현할 수 있다.

본문이 중괄호로 둘러싸인 함수를 **블록이 본문인 함수**라고 부르고

등호와 식으로 이루어진 함수를 **식이 본문인 함수**라고 한다.

식이 본문인 함수의 경우 굳이 사용자가 반환 타입을 적지 않아도 컴파일러가 함수 본문 식을 분석해서 반환 타입을 정해준다. (타입 추론)

#### 변수

- val(value에서 따옴) : 변경 불가능한 값을 저장한다. (자바의 final)
- var(variable에서 따옴) : 변경 가능한 값을 저장한다.

기본적으로 val 키워드를 사용해 불변 변수로 선언하고, 변경이 필요할 때에 var로 변경하는 것이 좋다.

val 참조 자체가 불변이라도 참조가 가리키는 객체의 내부 값은 변경될 수 있다.

var 키워드를 사용하면 변수의 값을 변경할 수 있지만 타입은 바꿀 수 없다.

문자열 리터럴에 변수 앞에 $를 넣어 문자열 템플릿 기능을 사용할 수 있다. (변수의 값이 문자열 리터럴과 이어져 나온다.)

### 클래스와 프로퍼티

```kotlin
class Person(val name: String)
```

코드 없이 데이터만 저장하는 클래스를 값객체라고 부른다.

코틀린은 기본 가시성이 public이며 생략할 수 있다.

#### 프로퍼티

**클래스라는 개념의 목적은 데이터를 캡슐화하고 캡슐화한 데이터를 다루는 코드를 한 주체 아래 가두는 것**이다.

자바에서는 필드를 private으로 생성하고 getter와 setter의 접근자 메소드를 활용하여 프로퍼티의 접근성을 제어하는데,

코틀린에선 이를 val과 var의 특징을 활용하여 제어한다.

```java
class Person{
  private String name;
  public String getName(){
    return this.name;
  }
  public void setName(String name){
    this.name=name;
  }
  //name은 읽기와 쓰기 모두 접근 가능한 프로퍼티이다.
  
  private int age;
  public int getAge(){
    return this.age
  }
  //age는 읽기만 가능한 read only 프로퍼티이다.
}
```

이 코드를 코틀린에서는

```kotlin
class Person(var name:String, val age:Int)
//name 읽기 쓰기 모두 접근 가능한 프로퍼티이고 age는 read only 프로퍼티이다.
```

이렇게 간단하게 사용할 수 있다.

#### 커스텀 접근자

```kotlin
class Person(val age: Int) {
    val availabilityOfDriving: Boolean
        get() = age > 19
}
```

위 코드의 Person 클래스는 getter를 자체 구현하는 코드이다.

Person 인스턴스가 availabilityOfDriving의 값을 읽으려하면 age에 따라 boolean값을 자동으로 반환한다.

### 디렉터리와 패키지

같은 패키지에 속해 있다면 다른 파일에서 정의한 선언일지라도 직접 사용할 수 있다.

다른 패키지에 정의한 선언은 import를 통해 불러와야 한다.

### enum & when

#### enum

```kotlin
enum class PersonEnumClass(val nickName: String, val age: Int) {
    JANE("jane", 15), POUL("pol", 13), JIMMY("jim", 23);

    fun introduce() = "$name($age)"
}

fun main(args: Array<String>) {
    val jane = PersonEnumClass.JANE
}
```

enum class는 각 객체를 나열하는 클래스이다.

프로퍼티나 메소드를 정의할 수도 있다.

#### when

```kotlin
fun getName(person: PersonEnumClass) = when (person) {
    PersonEnumClass.JANE -> {
        "jane"
    }
    PersonEnumClass.POUL -> {
        "poul"
    }
    PersonEnumClass.JIMMY -> {
        "jimmy"
    }
}
```

코틀린의 when문은 자바로 따지면 switch문에 해당한다.

when문도 if와 같이 식이기에 값을 반환한다.

```kotlin
fun getName(person: PersonEnumClass) = when (person) {
    PersonEnumClass.JANE,POUL,JIMMY->{
        
    }
}
```

여러 값을 매칭할 경우엔 콤마(,)로 구분한다.

코틀린의 when문은 임의의 객체를 허용한다.

#### auto casting

```kotlin
interface Life
class Human() : Life{
    fun think(){}
}
class Animal() : Life{
    fun bark(){}
}
fun doSomething(life:Life){
    when(life){
        is Human->{
            life.think()
        }
        is Animal->{
            life.bark()
        }
    }
}
```

코틀린에서 is를 사용해 변수 타입을 검사한다. (자바의 instanceof와 유사하다.)

코틀린에서는 컴파일러가 자동으로 캐스팅을 해주어 is로 타입을 검사하면 해당 타입으로 접근이 가능하다.

```kotlin
(life as Human).think()
```

원하는 타입으로 명시적 캐스팅을하려면 as 키워드를 사용한다.

### for & while

#### while

```kotlin
do {
    
} while (false)

while (true) {

}
```

코틀린의 while문은 자바의 while문과 동일하다.

#### for

```kotlin
for (i in 1..10) {

}
for (i in 100 downTo 0 step 2){
    
}
```

for는 자바의 for-each 루프에 해당하는 형태만 존재한다.

코틀린에서는 루프를 제어하기 위해서 범위를 사용한다. (1..10은 1부터 10까지의 범위를 포함한다.)

downTo를 사용하면 역방향 수열을 만들고 step은 증가 값의 절댓값을 바꾼다.

```kotlin
val map = TreeMap<Int, String>()
val list = ArrayList<Int>()
for ((k, v) in map) {

}
for (i in list){
    
}
```

리스트나 맵 등의 컬랙션을 활용할 수도 있다.

#### in

```kotlin
val list = listOf<Int>(1, 2, 3)
println(5 in list) //false
println(3 in 1..4) //true
```

in(!in) 연산자를 사용해 값이 범위나 컬렉션에 속하는지 검사할 수 있다.

## 함수 정의와 호출

### 컬렉션

```kotlin
val set = hashSetOf<Int>(1, 2, 3)
val list = arrayListOf<Int>(1,2,3)
val map = hashMapOf<Int, String>(1 to "a", 2 to "b")

list.maxOrNull() //최댓값
list.last() //마지막 값
```

코틀린은 표준 자바 컬렉션을 활용하여 자바 코드와 상호작용하기 쉽게 한다.

코틀린의 컬렉션은 자바 컬렉션과 똑같은 클래스이지만 코틀린에서는 더 많은 기능을 사용할 수 있다.

### 파라미터

```kotlin
fun subtract(big: Int, small: Int) = big - small
subtract(small = 1, big = 3)
```

함수를 호출할 때에 함수에 전달하는 인자 중 일부(또는 전부)의 이름을 명시할 수 있다.

```kotlin
fun subtract(big: Int, small: Int = 1) = big - small
subtract(big = 3)
```

함수의 default 값을 설정할 수도 있다.

### 최상위 함수 & 프로퍼티

```kotlin
fun examFunction(){
    
}
class Exam {
}
```

자바는 모든 코드를 클래스의 메소드로 작성해야하는 반면 코틀린은 이런 무의미한 클래스 없이 함수를 소스파일의 최상위 수준에 위치 시킬 수 있다.

다른 패키지에서 그 함수를 사용하고 싶으면 import할 수 있다.

JVM은 클래스 안에 들어있는 코드만을 실행하기 때문에 컴파일러는 이 파일을 컴파일할 때 새로운 클래스를 정의해준다.

프로퍼티 또한 최상위 수준에 위치할 수 있으며 이런 프로퍼티 값은 정적 필드에 저장된다.

### 확장 함수

```kotlin
fun Int.square() = this * this
```

확장 함수는 어떤 클래스의 멤버 메소드인 것처럼 호출할 수 있지만 클래스의 밖에 선언된 함수이다.

확장 함수를 만들기 위해서는 추가하려는 함수 이름 앞에 확장할 클래스의 이름을 붙이면 된다.

이 때 클래스 이름을 수신 객체 타입이라고 부르며 호출되는 대상을 수신 객체라고 한다.

확장 함수는 클래스의 일부가 아니기 때문에 정적 타입에 의해 호출 방식이 결정되며 오버라이드 되지 않는다.

### 가변 인자

varargs를 사용하면 원하는 개수만큼 값을 인자로 넘길 수 있다.

### 중위 호출

map을 생성할 때 사용하는 to라는 단어는 중위 호출이라는 방식으로 불러온 일반 메소드이다.

중위 호출 시에는 수신 객체와 유일한 메소드 인자 사이에 메소드 이름을 넣는다.

```kotlin
val map = mapOf<Int,String>(1 to "one", 2.to("two"))
```

두 가지 방식은 같은 기능을 하지만 첫번째 경우는 중위 호출을 사용한 경우이다.

중위 호출을 사용하게 하고 싶으면 infix를 함수 선언 앞에 추가한다.

```kotlin
infix fun Int.add(other: Int) = this + other //1 add 3와 같이 사용한다.
```

## 클래스, 객체, 인터페이스

### 인터페이스

```kotlin
interface Example{
    fun examFunction()
}
class ExampleClass():Example{
    override fun examFunction() {
        TODO("Not yet implemented")
    }
}
```

코틀린의 인터페이스는 자바 인터페이스와 비슷하다.

구현또는 상속하기 위해서는 클래스 이름 뒤에 콜론을 붙이고 인터페이스나 클래스 이름을 적으면 된다.

자바와 동일하게 단일 상속, 다중 구현으로 이루어진다.

override 변경자는 상위 클래스나 인터페이스의 프로퍼티나 메소드를 오버라이드한다는 표시이다. 자바의 어노테이션(@override)와 다르게 없으면 안된다.

### 변경자

```kotlin
class Mother {} //상속 x
open class Father {} //상속 o
abstract class Parent() {} //상속 o
```

자바에서는 final로 상속을 금지하지 않는 한 모든 클래스를 다른 클래스가 상속할 수 있다.

하지만 이는 자바의 철학적인 관점에서 옳지 않고 코틀린은 이를 막기 위해 기본 클래스와 메소드는 final로 생성된다.

클래스를 상속 허용하기 위해선 클래스 앞에 open을 붙여야 한다. (메소드나 프로퍼티도 마찬가지이다.)

기반 클래스를 오버라이드하는 경우 그 메소드는 기본적으로 open이다. 하위 클래스에서 오버라이드하지 못하게 금지하려면 final을 붙여야 한다.

코틀린에서도 자바처럼 abstract을 사용할 수 있다. abstract class는 오버라이드해야 하므로 항상 open이다.

### 가시성 변경자

가시성 변경자는 코드 기반에 있는 선언에 대한 클래스 외부 접근을 제어한다.

코틀린은 자바와 같이 public, protected, private 변경자가 있다.

코틀린은 자바와 다르게 기본 변경자가 public이며 패키지 전용 변경자가 없다. (패키지는 단순히 네임스페이스를 관리하기 위한 용도로 사용된다.)

대신 모듈 내부에서만 볼 수 있는 internal이라는 변경자가 있다.

또한 최상위 선언에 대해 private를 허용하여 같은 파일 내부에서만 사용할 수도 있다.

| 변경자       | 멤버        | 최상위 선언 |
| ------------ | ----------- | ----------- |
| public(기본) | 모든 곳     | 모든 곳     |
| internal     | 같은 모듈   | 같은 모듈   |
| protected    | 하위 클래스 | 적용 불가   |
| private      | 같은 클래스 | 같은 파일   |

### 내부 클래스

자바에서 다른 클래스 안에 정의한 클래스는 자동으로 내부 클래스이다. 내부 클래스는 바깥쪽 클래스를 자동으로 참조한다.

코틀린의 중첩클래스에서는 아무런 변경자가 붙지 않으면 자바의 static 중첩 클래스와 같다.

바깥쪽 클래스를 참조 하고 싶으면 inner 변경자를 붙이면 된다.

```kotlin
class OuterClass() {
    class InnerClass1() {
        // 외부 클래스를 참조하지 않는다.
    }

    inner class InnerClass2 {
        // 외부 클래스를 참조한다.
        fun getOuterReference() = this@OuterClass
    }
}
```

바깥쪽 클래스의 인스턴스를 가리려면 this@클래스 이름을 사용해야한다.

### sealed class

sealed class는 이 클래스를 상속한 하위 클래스 정의를 제한할 수 있다.

sealed 클래스의 하위 클래스는 반드시 상위 클래스 안에 중첩되어야 한다.

```kotlin
sealed class Creature {
    class Animal(): Creature()
    class Plant(): Creature()
}
```

```kotlin
fun doSomething(creature: Creature) {
    when (creature) {
        is Creature.Animal -> {

        }
        is Creature.Plant -> {

        }
    }
}
```

when 식에서 sealed 클래스를 처리할 때 디폴트 분기(else)가 필요하지 않다.

sealed class는 자동으로 열려져 있다. (open)

### 생성자

코틀린은 주생성자와 부생성자를 구분한다. 또한 초기화 블록을 통해 초키화 로직을 추가할 수 있다.

#### 주 생성자

클래스 이름 뒤에 오는 괄호로 둘러싸인 코드를 주생성자라고 한다.

주 생성자는 생성자 파라미터를 지정하고 그 생성자 파라미터에 의해 초기화되는 프로퍼티를 정의한다.

```kotlin
class Student constructor(_id: Int, _name: String) {
    val id: Int
    val name: String

    init {
        id = _id
        name = _name
    }
}
```

constructor 키워드는 주 생성자나 부 생성자를 정의할 때 사용한다.

init 키워드는 초기화 블록을 시작한다. 초기화 블록은 클래스가 인스턴스화될 때 실행된다.

초기화 블록은 주 생성자의 제한적인 코드 때문에 주 생성자와 함께 사용된다. 

한 클래스 안에 여러 초기화 블록을 선언할 수 있다.

```kotlin
class Student(val id: Int, val name: String)
```

주 생성자 앞에 별 다른 어노테이션이나 가시성 변경자가 없다면 constructor 키워드를 생략할 수 있다.

생성자 파라미터에 val, var을 추가하는 방식으로 정의와 초기화를 간략히 쓸 수 있다.

생성자 파라미터에도 디폴트 값을 정의할 수 있다.

```kotlin
open class Student constructor(val id: Int, val name: String)
class SecondGradeStudent(id: Int, name: String, major: String) : Student(id, name)
```

클래스에 부모 클래스가 있다면 주 생성자에서 부모 클래스의 생성자를 호출해야 한다.

부모 클래스를 초기화하기 위해 키반 클래스 이름 뒤에 생성자 인자를 넘긴다.

```kotlin
open class A
class B : A()
```

아무런 별도의 생성자를 정의하지 않으면 컴파일러가 자동으로 인자가 없는 디폴트 생성자를 만들어준다.

인자가 없는 생성자라도 상속한 하위 클래스에서는 반드시 기반 클래스의 생성자를 호출해야 한다.

이 규칙 때문에 기반 클래스의 이름 뒤에는 무조건 괄호가 들어간다.

인터페이스는 생성자가 없기 때문에 괄호가 쓰이지 않는다. 괄호의 유무를 통해 기반 클래스와 인터페이스를 쉽게 구분할 수 있다.

외부에서 인스턴스화하는 것을 막기 위해선 생성자를 private하면 된다.

#### 부 생성자

생성자가 여럿 필요한 경우 부 생성자를 사용한다.

부 생성자는 constructor 키워드로 시작하며 개수에 제한이 없다.

### 프로퍼티

#### 인터페이스의 프로퍼티

```kotlin
interface PropertyExam {
    val id: Int
}
```

코틀린에서는 인터페이스에 추상 프로퍼티 선언을 넣을 수 있다.

```kotlin
class Class1(override val id: Int) : PropertyExam {} //주 생성자에서 override
class Class2() : PropertyExam { //커스텀 게터
    override val id: Int
        get() = TODO("Not yet implemented")
}
class Class3(uId: Int) : PropertyExam { //프로퍼티 초기화
    override val id: Int = getIdByUId(uId)
}
```

인터페이스의 프로퍼티는 다양한 방식으로 구현할 수 있다.

### 커스텀 세터

```kotlin
class CustomSetterExam {
    var name:String="unknown"
    set(value) {
        println("name is changed $field -> $value")
        field=value
    }
  var id : Int=0
  private set
}
```

프로퍼티의 값을 바꿀 때 내부적으로 세터가 실행된다.

커스텀 세터를 정의하여 추가 로직을 실행할 수 있다.

커스텀 세터의 field는 기존의 값, set 뒤의 괄호(위 코드에서는 value)는 들어온 값을 의미한다.

접근자에서는 field 식별자를 통해 뒷받침하는 필드에 접근할 수 있다. 게터에서는 읽을 수만 있고, 세터에서는 읽고 쓸 수 있다.

접근자에 가시성을 넣어 외부에서 해당 프로퍼티의 수정을 막을 수 있다.

### 모든 클래스가 정의해야 하는 메소드

```kotlin
class Product(val name: String, val price: Int) {
    override fun toString(): String {
        return "Product (name : $name, price : $price)"
    }

    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Product) return false
        return other.name == name && other.price == price
    }

    override fun hashCode(): Int {
        return name.hashCode() * 31 * price
    }
}

fun main() {
    val product = Product("a", 1000)
    val product2 = Product("a", 1000)

    println(product.toString()) //Product (name : a, price : 1000)
    println(product.equals(product2)) //true
    println(product.hashCode()) //3007000
    println(product2.hashCode()) //3007000
}
```

자바와 같이 코틀린의 모든 클래스는 toString, equals, hashCode 등을 오버라이드할 수 있다.

#### toString()

객체의 문자열 표현을 반환한다.

#### equals()

두 객체가 같은지 반환한다.

equals()에서 true가 나올 경우, 그 두 객체는 같은 hashCode를 소유해야 한다.

> 자바의 ==은 원시 타입일 경우 값, 참조 타입일 경우 주소를 비교하여 boolean 값을 반환한다. 
>
> 따라서 객체가 같은지 비교하려면 equals를 호출해야 한다.
>
> 코틀린의 경우 ==은 내부적으로 equals를 호출하여 객체를 비교한다.
>
> 따라서 equals를 오버라이드 하면 ==를 통해 비교할 수 있다. 참조 비교를 위해서는 ===연산자를 사용한다.

#### hashCode()

hashCode는 객체를 식별하는 정수값을 말한다.

String의 hashCodes는 내용이 같다면 같은 코드를 반환하게 오버라이드 되어 있다.

31을 곱하는 이유는 소수이면서 홀수이기 때문이다. 

### 데이터 클래스

클래스가 데이터를 저장하는 역할을 수행하는 경우 toString, equals, hashCode를 반드시 오버라이드 해야한다.

코틀린의 data class는 이를 자동으로 만들어준다.

```kotlin
data class User(val id: Int, val name: String)
```

User 데이터 클래스는 equals, hashCode, toString의 모든 메소드를 포함한다.

equals와 hashCode는 주 생성자에 나열된 모든 프로퍼티를 고려해 만들어지므로 주 생성자 밖에 정의된 프로퍼티는 고려 대상이 아니다.

데이터 클래스는 이 말고도 몇 가지 유용한 메소드를 더 생성해준다.

데이터 클래스의 모든 프로퍼티가 val일 필요는 없으나 val로 불변성을 만듦을 권장한다.

#### copy()

copy 메소드는 객체를 복사하면서 일부 프로퍼티의 값을 바꾸게 해주는 메소드이다.

복사본은 원본가 다른 생명주기를 갖는다.

### 클래스 위임

하위 클래스가 상위 클래스의 메소드 중 일부를 오버라이드하면 하위 클래스는 상위 클래스의 세부 구현 사항에 의존하게 된다.

시스템이 변하면서 상위 클래스의 구성이 바뀌면 그 과정에서 하위 클래스에 문제가 생겨 코드가 정상 작동하지 못하는 경우가 생길 수 있다.

이를 방지하기 위해 코틀린에서는 기본적으로 클래스를 final로 취급하고 상속이 필요한 클래스만 open으로 두어 변경에 대해 대비한다.

하지만 상속을 허용하지 않는 클래스에 새로운 동작을 추가해야 할 때가 있다. 이럴 때 일반적으로 데코레이터 패턴을 사용한다.

#### 데코레이터 패턴

데코레이터 패턴은 객체에 유연한 메소드 수정을 돕는다.

interface로 이루어진 component와 이를 구현하는 concrete component와 decorator 그리고 decorator를 상속 받는 class로 이루어진다.

**component**

```kotlin
interface Robot {
    abstract fun assemble(): String
}
```

추상 메소드를 정의한다.

**concrete component**

```kotlin
class BasicRobot : Robot {
    override fun assemble(): String {
        return "조립"
    }
}
```

component를 구현한다. 기본 객체

**decorator**

```kotlin
open class RobotDecorator(val robot: Robot) : Robot {
    override fun assemble(): String {
        return robot.assemble()
    }
}
```

component를 구현하며, 생성자로 전달 받는다.

구현할 때 생성자로 전달 받은 component의 메소드를 실행한다.

**decorator를 상속받는 클래스**

```kotlin
class RobotWithFistDecorator(robot: Robot) : RobotDecorator(robot) {
    override fun assemble(): String {
        return super.assemble() + " 로봇주먹"
    }
}
```

```kotlin
class RobotWithWingDecorator(robot: Robot) : RobotDecorator(robot) {
    override fun assemble(): String {
        return super.assemble() + " 날개"
    }
}
```

생성자로 전달받은 객체의 메소드에 기능을 추가하는 클래스

**main**

```kotlin
fun main() {
  	//basic robot의 asssemble 메소드에 주먹을 추가한 객체
    val robotA = RobotWithFistDecorator(BasicRobot())
    //basic robot의 asssemble 메소드에 주먹과 날개를 추가한 객체
    val robotB = RobotWithWingDecorator(RobotWithFistDecorator(BasicRobot()))

    println(robotA.assemble())
    println(robotB.assemble())
}
```

#### by

데코레이터 패턴의 단점은 준비 코드가 상당히 많이 필요하다는 점이다.

코틀린은 이런 위임을 일급 객체 기능으로 지원한다.

인터페이스를 구현할 때 by 키워드를 통해 인터페이스에 대한 구현을 다른 객체에 위임 중이라는 사실을 명시할 수 있다.

```kotlin
class CountingSet<T>(
    val innerSet: MutableCollection<T> = HashSet()
) : MutableCollection<T> by innerSet {
    var counter: Int = 0 //증가 회수를 나타내는 변수
    override fun add(element: T): Boolean {
        counter++
        return innerSet.add(element) //위임한 객체의 메서드 실행
    }
}

fun main() {
    val set = CountingSet<Int>(arrayListOf())
    set.add(1)
    set.add(2)
    println(set.counter)
}
```

위의 예제는 증가 횟수를 가져올 수 있는 컬랙션을 만드는 코드이다.

CountingSet 클래스는 innerSet을 파라미터로 전달받아 MutableCollection의 구현을 innerSet에게 위임한다.

수정이 필요한 메서드는 오버라이딩하여 수정한다.

### Object

코틀린에서 object 키워드는 클래스를 정의하며 동시에 인스턴스를 생성한다.

#### 객체 선언

```kotlin
object CreditCard {
    private var balance: Int = 0
    fun pay(price: Int) {
        balance -= price
    }
}

fun main() {
    CreditCard.pay(1000)
}
```

최초 한 번만 메모리에 할당되고 그 인스턴스를 공유해야 할 때 사용한다.

코틀린에서는 object 키워드(객체 선언)를 사용하여 쉽게 싱글톤을 구현할 수 있다.

객체 선언은 클래스 선언과 그 클래스에 속한 단일 인스턴스 선언을 합친 선언이다.

객체 선언 안에는 클래스처럼 프로퍼티, 메소드, 초기화 블록 등이 들어갈 수 있으나 생성자는 사용할 수 없다.(객체 선언문이 있는 위치에서 즉시 인스턴스가 생성되기 때문)

이름 뒤에 마침표를 붙여 객체의 메소드나 프로퍼티에 접근할 수 있다.

클래스나 인터페이스를 상속할 수 있다.

클래스 안에 객체를 선언할 수 있다.(이 경우도 인스턴스는 하나 뿐이다.)

> 싱글톤 패턴과 객체 선언 모두 생성을 제어할 수 없고 생성자 파라미터를 지정할 수 없으므로 대규모 시스템에서 적합하지 않다. 
>
> 객체의 유연한 의존 관계가 필요할 경우 의존관계 주입 프레임 워크를 사용해야 한다.

#### 동반 객체

코틀린 클래스 안에는 정적인 멤버가 없다. 코틀린은 static 키워드를 지원하지 않는다.

그 대신 코틀린은 최상위 함수(정적 메소드의 대부분의 기능), 객체 선언(정적 메소드로 불가능한 기능, 정적 필드)를 활용한다.

최상위 함수는 private로 표시된 클래스 비공개 멤버에 접근할 수 없다.

비공개 멤버에 접근하려면 클래스에 중첩된 객체 선언을 해야한다. (동반 객체)

클래스 안에 정의된 객체에 companion 키워드를 붙이면 그 클래스는 동반 객체가 된다.

동반 객체의 프로퍼티나 메소드에 접근하려면 객체가 정의된 클래스 이름을 사용한다.

동반 객체는 자신을 둘러싼 클래스의 모든 멤버에 접근할 수 있다.

#### 무명 객체

```kotlin
view.addOnclickListner(object : ClickEventListener{
        override fun click() {
            TODO("Not yet implemented")
        }
})
```

object 키워드를 사용하여 무명 객체를 정의할 수 있다. 무명 객체는 자바의 무명 내부 클래스를 대신한다.

clickEventListner는 파라미터로 넘어가는 값이기에 이름이 딱히 필요 없다.

따라서 무명 객체를 선언하여 파라미터로 전달할 수 있다.

## 람다

람다는 다른 함수에 넘길 수 있는 작은 코드 조각을 뜻한다.

람다를 사용하면 쉽게 공통 코드 구조를 라이브러리 함수로 뽑아낼 수 있다.

### 람다 문법

#### 기본 문법

```kotlin
val sum = { x: Int, y: Int -> x + y } //람다 선언
run { println("hello lambda") } //run 함수
```

람다 식은 항상 중괄호로 둘러싸여 있다.

화살표(->)가 인자 목록과 람다 본문을 구분해준다.

람다 식은 변수에 저장할 수 있고 다른 일반 함수처럼 다룰 수 있다.

run은 인자로 받은 람다를 실행해주는 라이브러리 함수이다.

```kotlin
data class Student(val name: String, val age: Int)
val list = listOf<Student>(Student("lee",13),Student("kim",8),Student("park",17))
list.maxByOrNull { it.age }
list.maxByOrNull({ it: Student -> it.age }) // 풀어서 쓴다면 이것과 같다.
list.maxByOrNull() { it: Student -> it.age } // 함수 호출 시 맨 뒤에 있는 인자가 람다 식이라면 그 람다를 괄호 밖을 빼낼 수 있다.
list.maxByOrNull { it: Student -> it.age } // 람다가 어떤 함수의 유일한 인자이고 괄호 뒤에 람다를 썼다면 빈 괄호를 없앨 수 있다.
list.maxByOrNull { it -> it.age } // 파라미터 타입을 생략할 수도 있다.
list.maxByOrNull { it.age } // 람다의 파라미터가 하나 뿐이고 그 타입을 추론할 수 있는 경우 it을 바로 쓸 수 있다.
```

위 코드는 모두 list의 최댓값을 반환하는 함수이다.

컴파일러는 람다 파라미터의 타입을 추론할 수 있다.

파라미터의 이름을 따로 지정하지 않은 경우 it이라는 이름이 자동으로 만들어진다.

```kotlin
val sub = { a: Int, b: Int ->
    println("subtract")
    println("$a - $b ")

    a - b // 결과 값
}
```

본문이 여러 줄로 이루어진 경우 본문의 맨 마지막에 있는 식이 람다의 결과 값이다.

#### 변수 포획

```kotlin
fun countElements(set: Collection<Any>) {
    var counter = 0
    set.forEach {
        counter++
    }
}

```

자바와 다르게 코틀린에서는 람다 밖에 있는 파이널이 아닌 변수에 접근할 수 있다.

이를 변수 포획이라고 한다.

기본적으로 함수 안에 정의된 로컬 변수의 생명 주기는 함수가 반환되면 끝나지만,

어떤 함수가 자신의 로컬 변수를 포획한 람다를 반환하거나 다른 변수에 저장하면 생명주기가 달라질 수 있다.

#### 멤버 참조

```kotlin
val func1 = Student::age
```

::를 사용하는 식을 멤버 참조라고 부른다.

멤버 참조는 프로퍼티나 메소드를 단 하나만 호출하는 함수 값을 만들어준다.

::는 클래스와 멤버(프로퍼티, 메소드) 사이에 위치한다.

위 코드는 아래 코드와 같은 역할을 한다.

```kotlin
val func2 = { student: Student -> student.age }
run(::func2) //최상위 함수를 호출한다.
```

멤버 참조는 그 멤버를 호출하는 람다와 같은 타입이다.

```kotlin
list.maxByOrNull(Student::age)
list.maxByOrNull { it.age }
```

따라서 두 코드는 같은 역할을 한다.

```kotlin
val createNewStudent = ::Student
```

:: 뒤에 클래스 이름을 넣으면 생성자 참조를 만들 수 있다.

확장 함수도 멤버 함수와 같은 방식으로 참조할 수 있다.

### 람다 식을 활용한 컬렉션 API

람다 식을 활용한 함수형 프로그래밍 스타일을 사용하여 컬렉션을 편하게 다룰 수 있다.

#### filter

```kotlin
val list = listOf<Int>(1, 2, 3, 4, 5, 6)
println(list.filter { it > 3 }) //[4, 5, 6]
```

filter 함수는 컬렉션을 이터레이션하면서 주어진 람다에 각 원소를 넘겨서 true를 반환하는 원소만 모은다.

결과 값은 true를 반환한 요소들의 컬렉션이다.

#### map

```kotlin
println(list.map { it * 2 }) //[2, 4, 6, 8, 10, 12]
```

map 함수는 컬렉션의 원소에 적용한 결과를 모아서 새 컬렉션을 만든다.

```kotlin
val studentList = listOf<Student>()
println(studentList.filter { it.id == studentList.maxByOrNull(Student::id)?.id }) 
//id가 가장 높은 학생의 이름을 출력한다.
```

map과 filter를 사용하여 위와 같은 코드를 만들 수도 있다.

하지만 위의 코드는 maxByOrNull 연산을 list의 크기만큼 수행하므로

```kotlin
val maxId = studentList.maxByOrNull(Student::id)?.id
println(studentList.filter { it.id == maxId })
```

이 코드가 더 바람직하다.

#### all & any & count & find

```kotlin
val isBiggerthan10 = { num:Int -> num>10} //10보다 큰 수인지 반환하는 술어 함수
val numList= listOf<Int>(1,3,7,10,24)
println(numList.all(isBiggerthan10)) //false
println(numList.any(isBiggerthan10)) //true
println(numList.count(isBiggerthan10)) //1
println(numList.find(isBiggerthan10)) //24
```

all 함수는 모든 원소가 조건을 만족하는지를 반환한다.

any 함수는 조건을 만족하는 원소가 하나라도 있는지를 반환한다.

count 함수는 조건을 만족하는 원소의 수를 반환한다.

find 함수는 조건을 가장 먼저 만족하는 하나의 원소를 반환한다. (없다면 null)

#### groupBy

```kotlin
val studentList = listOf<Student>(Student(1, "lee"), Student(2, "park"), Student(3, "kim"), Student(1, "choi"))
println(studentList.groupBy { it.id })
//{1=[Student(id=1, name=lee), Student(id=1, name=choi)], 2=[Student(id=2, name=park)], 3=[Student(id=3, name=kim)]}
```

groupBy 함수는 특성에 따라 원소를 구분하여 키가 특성이고 값이 그룹인 맵을 반환한다.

위 코드의 경우 Map<Int,List<Student>>를 반환한다.

#### flatMap

```kotlin
val classRoomList = listOf<ClassRoom>(
    ClassRoom(1, studentList),
    ClassRoom(2, studentList.map { Student(it.id, it.name.reversed()) })
)
println(classRoomList.flatMap { it.students })
//[Student(id=1, name=lee), Student(id=2, name=park), Student(id=3, name=kim), Student(id=1, name=choi), Student(id=1, name=eel), Student(id=2, name=krap), Student(id=3, name=mik), Student(id=1, name=iohc)]

```

flatMap 함수는 인자로 주어진 람다를 컬렉션의 모든 객체에 적용하고 결과로 얻어지는 여러 리스트를 한 리스트로 모은다.

### 시퀀스를 활용한 지연 계산 

```kotlin
studentList.map(Student::id).filter { it > 2 }
```

map이나 filter 같은 컬렉션 함수들은 결과 컬렉션을 즉시 생성한다.

즉 컬렉션 함수를 연쇄하면 매 단계마다 중간 결과를 담는 임시 컬렉션이 생긴다는 말이다.

이는 원소의 수가 많아졌을 때 효율이 떨어지게 된다.

```kotlin
studentList.asSequence()
    .map { it.id }
    .filter { it > 2 }
    .toList()
```

위 코드는 이전 코드와 같은 역할을 한다. 하지만 위 코드는 중간 결과를 저장하는 컬렉션이 생기지 않기 때문에 성능이 좋아진다.

리스트를 시퀀스로 변환하고 map과 filter를 수행하며 이 값을 다시 리스트로 변환한다.

```kotlin
Sequence
.map{...} //중간 연산
.filter{...} //중간 연산
.toList //최종 연산
```

시퀀스는 중간 연산과 최종 연산으로 나뉜다. 중간 연산은 최초 시퀀스의 원소를 변환하는 방법을 아는 다른 시퀀스를 반환한다.

최종 연산은 결과를 반환한다. 결과는 최초 컬렉션에 대해 변환을 적용한 시퀀스로부터 계산을 수행해 얻는 컬렉션, 원소, 숫자 또는 객체이다.

중간 연산은 항상 지연 계산되며 최종 연산을 호출하면 연기됐던 모든 계산이 수행된다.

컬렉션을 사용하면 리스트를 다른 리스트로 변환하여 처리하고 시퀀스를 사용하면 원소를 하나씩 처리한다.

시퀀스의 경우 map보다 filter를 먼저 사용하는 것이 불필요한 계산을 줄여 효율적이다.

#### 시퀀스 만들기

```kotlin
val naturalNumber = generateSequence(0) { it + 1 }
val numbersTo100 = naturalNumber.takeWhile { it <= 100 }
val sumOfEven = numbersTo100
    .filter {
        it % 2 == 0
    }
    .sum()
println(sumOfEven) //2550
```

generateSquence 함수를 사용하여 시퀀스를 만들 수 있다.

이 함수는 이전의 원소를 인자로 받아 다음 원소를 계산한다.

### 자바 함수형 인터페이스 활용

```kotlin
fun postponeComputation(delay: Int, computation: Runnable) {}

//lambda
postponeComputation(1000) { println(42) }

//anonymous object
postponeComputation(1000, object : Runnable {
    override fun run() {
        TODO("Not yet implemented")
    }
})
```

추상 메소드가 단 하나만 있는 인터페이스를 함수형 인터페이스 또는 SAM 인터페이스라고 한다.

SAM은 단일 추상 메소드(Single Abstract Method)라는 뜻이다.

코틀린은 함수형 인터페이스를 인자로 취하는 자바 메소드를 호출할 때 람다를 넘길 수 있게 해준다.

> 자바와 달리 코틀린에는 함수 타입을 인자로 사용 가능하므로 SAM 인터페이스가 아니라 함수 타입을 인자로 사용해야 한다.

컴파일러는 자동으로 람다를 무명 클래스의 인스턴스로 만들어준다. 무명 클래스를 만들고 클래스 안의 유일한 추상 메서드를 람다의 본문으로 사용한다.

무명 객체를 생성해서 호출할 수도 있다.

```kotlin
fun returnRunnable():Runnable{
    return Runnable {  }
}
```

함수형 인터페이스의 인스턴스를 반환하기위해서는 반환하고픈 람다를 SAM 생성자로 감싸야한다.

### with & apply

두 함수는 수신 객체를 명시하지 않고 람다의 본문 안에서 다른 객체의 메소드를 호출할 수 있게 한다.

그런 람다를 수신 객체 지정 람다라고 부른다.

#### with

```kotlin
fun even(limit: Int): List<Int> {
    val evenList = mutableListOf<Int>()
    for (i in 1..limit){
        if(i%2==0){
            evenList.add(i)
        }
    }
    return evenList
}
```

위 코드에서 여러 메소드를 호출하게 되면  evenList가 여러 번 사용된다. 코드가 더 길거나 다른 메소드들이 많이 되는 경우 이는 가독성이 떨어질 수 있다.

위 코드를 with을 사용하여 가독성 좋게 수정할 수 있다.

```kotlin
fun even(limit: Int): List<Int> {
    return with(mutableListOf<Int>()) {
        for (i in 1..limit) {
            if (i % 2 == 0) {
                add(i)
            }
        }
        this
    }
}
```

with는 파라미터가 두 개인 함수이다.

첫 번째 인자로 받은 객체를 두 번째 인자인 람다의 수신 객체로 만든다.

람다에서는  this.을 사용해 그 수신 객체에 접근할 수 있으며 이는 생략 가능하다.

#### apply

```kotlin
fun even(limit: Int): List<Int> = mutableListOf<Int>().apply {
    for (i in 1..limit){
        if(i%2==0){
            add(i)
        }
    }
}
```

apply 함수는 항상 자신에게 전달된 객체를 반환한다는 점을 제외하고는 with와 거의 같다.

apply 함수는 객체의 인스턴스를 만들면서 즉시 초기화가 필요할 경우 유용하게 쓸 수 있다.

apply 함수는 확장 함수기에 apply의 수신 객체가 전달받은 람다의 수신 객체가 된다.

## 코틀린 타입 시스템

### 널 가능성

널 가능성은 NullPointerException 오류를 피할 수 있게 하기 위한 코틀린 타입 시스템의 특성이다.

코틀린은 널이 될 수 있는지 여부를 타입 시스템에 추가함으로써 컴파일 시 여러 오류를 미리 감지하여 실행 시점에서의 예외를 줄여준다.

#### 널이 될 수 있는 타입

```kotlin
fun strLen(string: String): Int = string.length
fun nullableStrLen(string: String?): Int = string.length //string은 null일 수 있으므로 해당 연산이 불가능하다
strLen(null) //불가능
nullableStrLen(null) //가능
```

코틀린의 모든 타입은 기본적으로 널이 될 수 없는 타입이다.

타입 이름 뒤에 물음표를 붙이면 그 타입의 변수나 프로퍼티에 null을 허용한다는 뜻이다.

널이 될 수 있는 타입에는 많은 제약 조건이 붙는다.

- 널이 될 수 있는 타입의 변수는 수행할 수 있는 연산이 제한된다.

- 널이 될 수 있는 타입의 변수는 변수.메소드()처럼 메소드를 직접 호출할 수 없다.

- 널이 될 수 있는 값을 널이 될 수 없는 타입의 변수에 대입할 수 없다.

- 널이 될 수 있는 값을 널이 될 수 없는 타입의 파라미터로 넣을 수 없다.

- 널이 될 수 있는 타입은 null과 비교하고 나면 그 값을 기억한다.

```kotlin
fun nullableStrLen(string: String?): Int = if (string != null) string.length else 0 //null이 아님을 확인했기에 연산을 호출할 수 있다.
```

#### ?. (안전한 호출 연산자)

```kotlin
fun nullableStrLen(string: String?): Int? = string?.length
//fun nullableStrLen(string: String?): Int? = if (string != null) string.length else null과 같다.
```

?. 연산자는 null 검사와 메소드 호출을 한 번의 연산으로 수행한다.

호출하는 값이 null이 아니라면 메소드를 호출하고 null이라면 호출을 무시하고 null 결과 값이 된다.

#### ?: (엘비스 연산자)

```kotlin
fun nullableStrLen(string: String?): Int = string?.length ?: 0
//fun nullableStrLen(string: String?): Int = if(if (string != null) string.length else null)!=null) string.length else 0와 같다.
```

엘비스 연산자는 null 대신 사용할 디폴트 값을 지정할 때 편리하게 사용할 수 있다.

엘비스 연산자는 이항 연산자로 값이 null인지 검사하여 null이 아니면 좌항의 값, null이면 우항의 default값이 반환된다.

엘비스 연산자의 우항에 return, throw 등의 연산을 넣을 수도 있다.

#### as? (안전한 캐스트)

as? 연산자는 어떤 값을 지정한 타입으로 캐스트하고 변환할 수 없으면 null을 반환한다.

안전한 캐스트는 보통 캐스트를 수행한 뒤에 엘비스 연산자를 사용한다.

#### !! (널 아님 단언)

!! 연산자를 사용하면 어떤 값이든 null이 될 수 없는 타입으로 바꿀 수 있다.

null에 !! 연산자를 사용하면 NullPointerException이 발생한다.

!! 연산자를 사용하기보다 더 나은 해법을 찾아보는 것이 좋다.

### let 함수

```kotlin
val num: Int? = null
num?.let {
    someMethod(it)
    someMethod2(it)
}
//num이 null이므로 아무 일도 일어나지 않는다.
```

let 함수를 안전한 호출 연산자(?.)와 함께 사용하면 null인지 검사 후에 값을 편리하게 사용할 수 있다.

안전한 호출 연산자를 사용하여 호출한 let 함수는 수신 객체가 null이 아닐 경우 null이 될 수 없는 타입의 수신 객체를 람다에게 전달한다.

수신 객체가 null일 경우 아무 일도 일어나지 않는다.

### lateinit

```kotlin
var student:Student?=null
fun initProperty(student: Student){
    this.student=student
}
//bad way
```

코틀린에서 일반적으로 생성자에서 모든 프로퍼티를 초기화해야 한다.

그래서 널이 될 수 있는 타입으로 프로퍼티를 선언하고 초기화 하는 경우가 있는데,

이는 프로퍼티의 모든 접근에 널 검사를 넣거나 !! 연산자를 써야하는 불편함이 있다.

```kotlin
lateinit var student:Student
fun initProperty(student: Student){
    this.student=student
}
```

이를 해결하기 위해 lateinit 변경자를 붙여 프로퍼티를 나중에 초기화 할 수 있다.

나중에 초기화하는 프로퍼티는 항상 var로 선언돼야 한다.

lateinit 프로퍼티를 초기화 하기 전에 프로퍼티에 접근하면 "lateinit 프로퍼티를 아직 초기화하지 않았음" 예외가 발생한다.

### 널이 될 수 있는 타입 확장

널이 될 수 있는 타입에 대한 확장 함수를 정의하면 null값을 효율적으로 활용할 수 있다.

예를 들어 String? 타입의 수신 객체에 대해 호출할 수 있는 isNullOrEmpty, isNullOrBlank가 있다.

### 타입 파라미터

모든 타입 파라미터는 널이 될 수 있다.

### 자바와 상호 운용성

```java
@Nullable
String string1; //var string1:String?
@NotNull
String string2; //var string2:String?
```

코틀린의 널 허용성은 자바의 어노테이션으로 표현된다.

**플랫폼 타입**

플랫폼 타입은 코틀린이 널 관련 정보를 알 수 없는 타입을 말한다.

어노테이션 없이 쓰여진 자바 코드의 경우 코틀린 컴파일러가 널 가능성에 대해 모르기(플랫폼 타입이기) 때문에 직접 처리해야 한다.

널 체크를 해도, 하지 않아도 되며 널체크를 하지 않을 때 예외가 발생될 수 있음을 염두에 둬야 한다.

**상속**

코틀린에서 자바 메소드를 오버라이드할 때 그 메소드의 파라미터와 반환타입의 널 허용성에 대해 생각해봐야 한다.

코틀린 컴파일러는 널 허용성에 대해 모든 구현을 받아들인다.

### 원시 타입

자바는 원시 타입과 참조 타입을 구분한다.

원시 타입(int, double...)은 변수에 그 값이 직접 들어가지만, 참조 타입(String...)의 변수에는 메모리상의 객체 위치가 들어간다.

코틀린은 원시 타입과 참조 타입을 구분하지 않는다.

그렇다고 모두 객체(참조 타입)로 표현하지는다.(모두 객체로 표현할 경우 비효율적이다.)

코틀린은 원시타입을 실행 시점에서 가능한 가장 효율적인 방식으로 표현된다. (ex 그냥 사용할 경우  Int, 컬렉션의 타입 파라미터로 들어갈 경우 Integer)

자바에서는 참조 타입에만 null을 사용할 수 있으므로 null이 될 수 있는 원시 타입의 경우 자바의 래퍼 타입으로 컴파일 된다.

### 숫자 변환

```kotlin
val i = 1
val j: Long = i //자동 변환(불가능)
val k: Long = i.toLong() //변환 메소드 호출(가능)
```

코틀린은 숫자를 다른 타입의 숫자로 자동 변환하지 않는다.

숫자의 타입을 변환할 경우 변환 메소드를 호출해야 한다.

### Any, Any?

자바에서  Object가 클래스의 최상위 타입인 것처럼 코틀린의 최상위 타입은 Any 타입이다.

자바에서는 참조 타입만 Object의 계층에 포함되며 원시 타입은 포함되지 않지만 코틀린의 Any타입은 모든 타입의 조상 타입이다.

Any는 자바의 Object와 대응하며 toString, equals, hashCode 메소드가 들어있다. (자바의 wait나 notify는 Object로 형변환을 해야 가능하다.)

### Unit

Unit 타입은 자바 void와 같은 기능이다. 반환하지 않는 함수의 반환 타입으로 사용 가능하다.

### Nothing

```kotlin
fun fail(msg: String): Nothing {
    throw Exception(msg)
}

val result: String?=null
println(result ?: fail("fail"))
println("result is arrived")
```

Nothing 타입은 함수가 정상적으로 끝나지 않는다는 의미를 갖고 있다.

Nothing 타입은 아무 값을 포함하지 않아서 함수의 반환 타입이나 반환 타입으로 쓰일 타입 파라미터로만 쓰일 수 있다.

엘비스 연산자의 우항에 Nothing을 반환하는 함수를 사용하면 null일 경우 오류를 발생한다는 것을 컴파일러가 파악하고 해당 값이 null이 아님을 추론한다.

### 컬렉션과 배열

List<Int?>의 경우 Int? 타입의 값을 저장하는 리스트이고 List<Int>?의 경우 null일 수 있는  Int형 리스트이다.

코틀린에서는 컬렉션을 읽기 전용 컬렉션(Collection)과 변경 가능한 컬렉션(MutableCollection)으로 나눈다.

코드에서 가능하면 읽기 전용 컬렉션을 사용하고 변경할 필요가 있을 때만 변경 가능한 컬렉션을 사용하는 것이 좋다. (용도를 분명히 하기 위해)

코틀린에서 배열을 만드는 방법은 다양하다.

- arrayOf 함수에 원소를 넘긴다
- arrayOfNulls 함수에 정수 값을 인자로 넘기면 모든 원소가 null이고 인자로 넘긴 값과 크기가 같은 배열을 만들 수 있다.
- Array 생성자는 배열 크기와 람다를 인자로 받아서 람다를 호출해 원소를 초기화 해준다.
- 원시 타입의 배열을 만들기 위해서는 원시 타입마다 제공되는 별도 클래스를 생성한다. (IntArray, ByteArray)

## 연산자 오버로딩

코틀린은 언어의 기능과 미리 정해진 이름의 함수를 연결해주는 관례를 사용한다.

기존 자바 클래스에 대해 확장 함수를 구현하면서 관례에 따라 이름을 붙이면 기존 자바 코드를 바꾸지 않아도 새로운 기능을 쉽게 부여할 수 있다.

### 산술 연산자 오버로딩

자바에서는 String에 대해 +연산자를 사용할 수 있고  원시 타입에 대해서만 산술 연산자를 사용할 수 있다.

코틀린에서는 클래스에 대해 일반 산술 연산자를 정의할 수 있다.

#### 이항 산술 연산 오버로딩

```kotlin
data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point): Point = Point(x + other.x, y + other.y)
}

fun main() {
    val point1=Point(3,4)
    val point2=Point(4,2)
    println(point1 + point2)
}
```

operator 키워드가 붙은 plus 함수는 +로 호출할 수 있다.

operator 키워드는 그 함수가 관례를 따르는 함수임을 뜻한다.

operator가 없는데 관례에서 사용하는 함수 이름을 쓰면 operator 변경자를 추가해야한다는 오류가 뜬다.

```kotlin
operator fun Point.plus(other: Point):Point=Point(x+other.x,y+other.y)
```

확장 함수로 정의할 수도 있다.

| 식    | 함수 이름 |
| :---- | --------- |
| a * b | times     |
| a / b | div       |
| a % b | mod       |
| a + b | plus      |
| a - b | minus     |

연산자 우선순위는 표준 연산자 우선 순위와 같다.

연산자를 정의할 때 두 피연산자가 같은 타입일 필요는 없다. 연산자의 수신 객체와 반환타입 또한 다른 타입이어도 된다.

코틀린 연산자가 자동으로 교환법칙을 지원하지는 않는다.

#### 복합 대입 연산자 오버로딩

```kotlin
operator fun MutableCollection<Point>.plusAssign(other: Point){
    this.add(other)
}
```

코틀린은 +=, -=와 같은 복합 대입 연산자 오버로딩도 지원한다.

+=연산의 경우 자동으로 A=A+B가 호출되기도 하지만

반환 타입이 plusAssign, minusAssign처럼 Assign을 붙여 오버로딩할 수도 있다.

plus와 plusAssign을 동시에 정의하면 오류가 생기므로 동시에 정의해서는 안된다.

#### 단항 연산자 오버로딩

```kotlin
operator fun Point.not():Point{
    return Point(this.y,this.x)
}
```

단항 연산자도 마찬가지로 operator 키워드와 미리 정의된 함수의 이름으로 오버로딩할 수 있다.

이 때 파라미터는 필요하지 않다.

| 식       | 함수 이름  |
| -------- | ---------- |
| +a       | unaryPlus  |
| -a       | unaryMinus |
| !a       | not        |
| ++a, a++ | inc        |
| --a, a-- | dec        |

### 비교 연산자 오버로딩

#### equals

```kotlin
class Board(val id: Long, val title: String, val contents: String) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Board) return false
        return other.id == this.id && other.contents == this.contents && other.title == this.title
    }
}
```

== 연산자 호출은 equals 메소드 호출로 컴파일 된다. 또한 != 연산자 또한 equals 메소드 호출의 값을 부정한 값으로 호출된다.

==와 !=는 내부에서 인자가 널인지 검사하므로 널이 될 수 있는 타입의 값에 사용할 수 있다.

a==b를 호출할 경우 a가 널이 아닌 경우에 a.equals(b)를 호출하고 a가 널이고 b도 널이라면 true를 반환한다.

=== 연산자(식별자 비교)는 객체가 같은지 검사한다. (===는 오버로딩할 수 없다.)

equals는 Any의 operator 메소드를 오버라이드하는 것이므로 operation 대신 override가 붙어있다.

Any에서 상속받은 equals가 확장 함수보다 우선 순위가 높기 때문에 equals는 확장 함수로 정의할 수 없다.

```kotlin
val board=Board(1,"a","aa")
val board2=Board(1,"a","aa")
val board3=Board(2,"ab","aa")
println(board==board2) //true
println(board==null) //false
println(board==board3) //false
```

#### compareTo

```kotlin
class Board(val id: Long, val title: String, val contents: String) : Comparable<Board> {
    override fun compareTo(other: Board): Int {
        return compareValuesBy(this, other,Board::id)
    }
}
```

자바의 Comparable 인터페이스의 compareTo 메소드는 한 객체와 다른 객체의 크기를 비교해 정수로 나타내준다,

코틀린에서는 비교 연산자(<, >, <=, >=)는 compareTo 메소드를 호출하는 관례를 제공한다.

a>=b -> a.compareTo(b)>=0 으로 호출된다.

compareTo도 Comparable의 operator 메소드를 오버라이드 하는 것이므로 operator를 붙일 필요 없다.

compareValuesBy는 코틀린의 표준 라이브러리 함수이다. 두 객체와 여러 비교 함수를 인자로 받아 두 객체를 비교해준다.

### 컬렉션에 관한 관례

#### get, set

```kotlin
data class Name(val firstName:String, val lastName:String){
    operator fun get(index:Int):String{
        return when(index){
            0-> firstName
            1-> lastName
            else -> throw IndexOutOfBoundsException()
        }
    }
}
```

인덱스 연산자를 사용해 원소를 읽는 연산은 get 연산자 메소드로 변환되고, 원소를 쓰는 연산은 set 메소드로 변환된다.

파라미터는 다양한 타입이 가능하고 여러 개도 가능하다.

get은 class[index], set은 class[index]=value로 호출된다.

```kotlin
operator fun set(index: Int,value:String){
    when(index){
        0->firstName=value
        1->lastName=value
        else->throw IndexOutOfBoundsException()
    }
}
```

#### in

```kotlin
operator fun contains(c:Char):Boolean{
    return firstName.contains(c)||lastName.contains(c)
}
```

in 연산자는 객체가 컬렉션에 들어있는지 검사한다.

in연산자는 contains를 호출한다.

in 연산자의 우항이 수신 객체, 좌항이 파라미터가 된다.

#### rangeTo

```kotlin
var now=LocalDate.now()
val thisWeek=now..now.plusWeeks(1)
println(now.plusDays(1) in thisWeek)
```

범위를 만들기 위해서는 ..연산자를 사용한다. (1..10은 1부터 10까지의 범위를 말한다.)

.. 연산자는 rangeTo 메소드를 호출한다.

rangeTo는 범위를 반환하며  in을 통해 범위에 속해있는지 검사할 수 있다.

코틀린 표준 라이브러리에는 모든  Comparable 객체에 대해 적용 가능한  rangeTo 함수가 들어있다.

#### iterator 

```kotlin
operator fun ClosedRange<LocalDate>.iterator():Iterator<LocalDate> = object :Iterator<LocalDate>{
    var current=start
    override fun hasNext(): Boolean {
        return current<=endInclusive
    }

    override fun next(): LocalDate =current.apply {
        current=plusDays(1)
    }
}
```

코틀린의 for 루프는 범위 검사와 동일하게 in 연산자를 사용한다.

하지만 이 때 in은 list.iterator()를 호출하여 이터레이터를 얻고 iterator.hasNext/next 메소드를 호출하는 식으로 변환된다.

확장 함수 iterator를 정의하면 for 루프 안에서 사용할 수 있다.

### 구조 분해 선언

```kotlin
val myName=Name("lee","hyungjin")
val (first,last)=myName
// first="lee", last="hyungjin"
```

구조 분해를 사용하면 복합적인 값을 분해해서 여러 다른 변수를 한꺼번에 초기화 할 수 있다.

구조 분해 선언은 각 변수를 초기화 하기 위해 componentN 메소드를 호출한다(N은 변수 위치에 따라 붙는 번호이다.)

데이터 클래스의 주 생성자에 들어있는 프로퍼티에 대해서는 컴파일러가 자동으로 componentN 함수를 만들어 준다.

```kotlin
class Locate(val x:Int,val y : Int){
    operator fun component1()=x
    operator fun component2()=y
}
```

데이터 클래스가 아닌 경우 componentN 함수를 오버로딩하여 사용할 수 있다.

### 초기화 지연 패턴

```kotlin
class Teacher {
    private var _students: List<Student>? = null
    val students: List<Student>
        get() {
            if (_students == null) _students = getList()
            return _students!!
        }
}
```

지연 초기화는 객체의 일부분을 초기화하지 않고 남겨뒀다가 그 부분이 필요할 경우 초기화할 때 쓰이는 패턴이다.

초기화 과정에 자원을 많이 사용하거나 객체를 사용할 때마다 꼭 초기화하지 않아도 되는 프로퍼티에 지연 초기화 패턴을 사용한다.

_students라는 프로퍼티는 값을 저장하고 students는 _students라는 프로퍼티에 대한 읽기 연산만을 제공한다.

_students는 널이 가능한 타입이지만 students는 널이 될 수 없는 타입이기에 프로퍼티를 두 개 사용해야 한다.

#### by lazy를 활용한 초기화 지연

```kotlin
val students:List<Student> by lazy { getList() }
```

lazy 함수는 코틀린 관례에 맞는 시그니처의 getValue 메소드가 들어있는 메소드를 반환한다.

lazy 함수의 인자는 값을 초기화할 때 호출할 람다이다.

#### 위임 프로퍼티 구현

```kotlin
//changeSupport를 갖는 도우미 클래스
open class PropertyChangeAware {
    protected val changeSupport = PropertyChangeSupport(this)
    fun addPropertyChangeListener(listener: PropertyChangeListener) {
        changeSupport.addPropertyChangeListener(listener)
    }

    fun removePropertyChangeListener(listener: PropertyChangeListener) {
        changeSupport.removePropertyChangeListener(listener)
    }
}
```

프로퍼티가 바뀔 때 리스너에게 변경 통지를 보내고 싶을 때 자바에선 PropertyChangeSupport와 PropertyChangeEvent 클래스를 사용하여 자주 처리하곤 한다.

PropertyChangeSupport 클래스는 리스너의 목록을 관리하고 PropertyChangeEvent가 들어오면 모든 리스너에게 이벤트를 통지한다.

```kotlin
class Person(val name: String, age: Int, salary: Int) : PropertyChangeAware() {
    var age: Int = age
        set(value) {
            val oldValue = field
            field = value
            changeSupport.firePropertyChange(
                "age", oldValue, value
            ) // 이벤트 보내기
        }
}

fun main() {
    val a = Person("lee", 13, 3500)
    a.addPropertyChangeListener {
        println("${it.propertyName} value is changed ${it.oldValue} -> ${it.newValue}")
    }
    a.age = 18 //age value is changed 13 -> 18
}
```

위 코드를 코틀린에 관례에 맞게 수정하면 다음과 같다.

```kotlin
class ObservableProperty(var propValue: Int, val changeSupport: PropertyChangeSupport) {
    operator fun getValue(p: PersonRefactored, prop: KProperty<*>): Int = propValue
    operator fun setValue(p: PersonRefactored, prop: KProperty<*>, value: Int) {
        val oldValue = propValue
        propValue = value
        changeSupport.firePropertyChange(prop.name, oldValue, value)
    }
}

class PersonRefactored(val name: String, age: Int, salary: Int) : PropertyChangeAware() {
    var age by ObservableProperty(age, changeSupport)
    var salary by ObservableProperty(salary,changeSupport)
}
```

getValue, setValue함수가 있으면 by를 통해 위임 프로퍼티를 사용할 수 있다.

by 오른 쪽에 오는 객체를 위임 객체라고 한다.

코틀린은 위임 객체를 감춰진 프로퍼티에 저장하고, 주 객체의 프로퍼티를 읽거나 쓸 때 위임 객체의 get,setValue를 호출한다.

```kotlin
var salary: Int by Delegates.observable(0) { property, oldValue, newValue ->
    println("${property.name} is changed $oldValue -> $newValue")
}
```

관찰 가능한 프로퍼티 로직을 코틀린 표준 라이브러리로 쉽게 사용할 수 있다.

## 고차 함수

고차 함수는 함수를 인자로 받거나 반환하는 함수이다.

람다나 함수 참조를 사용해 함수를 값으로 표현할 수 있다.

### 함수 타입

```kotlin
val add = { x: Int, y: Int -> x + y }
val sub: (Int, Int) -> Int = { x: Int, y: Int -> x - y }
val div: (Int, Int) -> Int? = { x: Int, y: Int -> (x / y) ?: null } //canReturnNull
val mul: ((Int, Int) -> Int)? = { x: Int, y: Int -> x * y } //funOrNull
```

코틀린의 타입 추론으로 인해 변수 타입을 지정하지 않아도 함수 타입임을 추론할 수 있다.

함수 타입임을 명시하려면 "(파라미터)->반환타입"으로 타입을 선언한다.

함수의 반환형이 null일 수도, 함수 타입 자체가 null일 수도 있다.

### 함수 호출

```kotlin
fun calculateOneAndTwo(operator: (Int, Int) -> Int): Int {
    return operator(1, 2)
}
fun calculateOneAndTwo(operation: (Int, Int) -> Int = { x, y -> x * y }) {
    println(operation(1, 2))
}
```

인자로 받은 함수의 호출은 일반 함수와 마찬가지로 "함수명(파라미터)" 형태로 이루어진다.

함수 타입의 파라미터에 디폴트 값을 넣을 수도 있다.

### 함수 반환

```kotlin
fun someFun(n: Int): (num: Int) -> Int {}
```

함수를 반환 타입으로 사용할 수도 있다.

상태나 조건에 따라 달라질 수 있는 로직이 있을 때 이는 유용하게 쓰일 수 있다.

### inline 함수

```kotlin
inline fun someMethod(noinline f:()->Unit){
    someMethod2(f)
}
fun someMethod2(f:()->Unit){

}
```

코틀린은 고차 함수를 컴파일 할 때 익명 객체를 매번 생성하도록 되어 있기 때문에 이는 성능을 떨어뜨릴 수 있다.

어떤 함수를 inline으로 선언하면 그 함수를 호출할 때 함수 본문을 번역한 바이트 코드로 컴파일 된다.

inline함수는 코드를 내부적으로 복사하기 때문에 코드가 길어지면 비효율적일 수 있으며, 전달받은 함수를 다른 함수로 전달할 수 없다,

inline함수에서 제외할 파라미터에 noinline 키워드를 사용하여 inline 함수가 아님을 선언하면 이 함수는 다른 함수로 전달할 수 있다.

### 흐름 제어

```kotlin
fun findZero(numList:List<Int>){
    numList.forEach { 
        if(it==0){
            println("find zero")
            return
        }
        println("cannot find zero")
    }
}
```

람다 안에서 return을 사용하면 그 람다를 호출하는 함수도 실행을 끝내고 반환된다.

자신을 둘러싼 블록보다 더 바깥 블록을 반환하게 만드는 return 문을 넌 로컬 return이라고 부른다.

return이 바깥쪽 함수를 반환시킬 수 있을 때는 람다를 인자로 받는 함수가 인라인 함수인 경우 뿐이다.

```kotlin
fun findOne(numList:List<Int>){
    numList.forEach lable@{
        if(it==1){
            println("find one")
            return@lable
        }
        println("cannot find one")
    }
}
```

람다 식에서도 label을 사용하여 로컬 return을 사용할 수 있다.

### 무명 함수

```kotlin
fun findTwo(numList: List<Int>) {
    numList.forEach ( fun(num) {
            if (num == 2) {
                println("find two")
                return
            }
            println("cannot find two")
        })
```

무명 함수는 함수 이름이나 파라미터 타입을 생략한 함수이다.

무명 함수에서의 return은 가장 가까운 무명 함수를 벗어나므로 local return이다.

## 제네릭

### 타입 파라미터

```kotlin
val stringList: List<String> = listOf<String>() //List<T>
val map: Map<Int, String> = mapOf<Int, String>() //Map<K,V>
```

제네릭스를 사용하면 타입 파라미터를 받는 타입을 정의할 수 있다.

제네릭 타입의 인스턴스를 만들기 위해서는 타입 파라미터를 구체적인 타입 인자로 치환해야 한다.

```kotlin
val stringList: List<String> = listOf<String>()
val stringList2 = listOf<String>()
val stringList3 = listOf("aaa","bbb")
val stringList4:List<String> = listOf()
```

코틀린 컴파일러는 타입 파라미터를 추론할 수 있다.

### 제네릭 함수

```kotlin
fun <T> List<T>.printAll() {
    for (i in this) {
        println(i)
    }
}
```

함수 이름 앞에 타입 파라미터를 선언하여 제네릭 함수를 선언할 수 있다.

```kotlin
listOf<String>("aa", "bb", "cc").printAll()
listOf("aa","bb").printAll()
```

제네릭 함수를 호출할 때에는 타입 인자를 명시적으로 지정해야하지만, 대부분 컴파일러가 추론할 수 있기에 그럴 필요 없다.

```kotlin
val <T> List<T>.penultimate: T
    get() = this[size - 2]
```

제네릭 확장 프로퍼티를 선언할 수도 있다.

### 제네릭 클래스

```kotlin
interface List<T>{
    operator fun get(index:Int):T
}
class ArrayList<T>:List<T>{
    override fun get(index: Int): T {
        TODO("Not yet implemented")
    }
}
class StringList:List<String>{
    override fun get(index: Int): String {
        TODO("Not yet implemented")
    }
}
```

제네릭 클래스를 만들 수 있다.

제네릭 클래스를 확장하는 클래스는 기반 타입의 타입 인자를 정해야 한다.

클래스가 자기 자신을 타입 인자로 사용할 수도 있다.

### 타입 파라미터 제약

```kotlin
fun <T : Number> someMethod(num: T) {} //Number로 타입 인자를 제한했다.

fun <T> ensureTrailingPeriod(seq:T){ //타입 인자의 제한을 두 개 이상 걸 때에는 이렇게 해야한다.
  where T : CharSequence, T: Appendable{
    if(!seq.endsWith('.'){
      seq.append('.')
    })
  }
}
```

타입 파라미터 제약은 타입 인자를 제한하는 기능이다.

타입 파라미터에 제약을 걸면 제네릭 타입을 인스턴스화할 때 사용하는 타입 인자는 그 타입 혹은 하위 타입이어야 한다.

### 널이 될 수 없는 타입으로 한정

```kotlin
fun <T:Any>someMethod(value:T){
    println(value.toString())
}
```

아무런 제한을 걸지 않은 타입 인자는 Any?를 제한으로 건 것과 같다.

항상 널이 될 수 없는 타입만 타입 인자로 받기 위해서는 타입 파라미터를 제한해야 한다.

### 제네릭의 타입 소거

```kotlin
fun checkIsList(value:Any){
    println(value is List<*>)
}
```

제네릭은 타입 소거를 사용해 구현된다. 실행 시점에 제네릭 클래스의 인스턴스에 타입 인자 정보가 들어있지 않다.

이는 저장해야 하는 타입 정보의 크기를 줄여 메모리 사용이 줄어든다는 장점이 있지만 실행 시점에서 타입 인자를 알 수 없다는 문제점이 생긴다.

예를 들어 List<String>의 객체를 만들더라도 실행 시점에서 그 객체는 오직 List로만 볼 뿐, 어떤타입의 원소를 저장하는지 모른다는 것이다.

제네릭을 사용할 때 꼭 타입 인자를 명시해야하기 때문에 지금 인자를 알 수 없는 제네릭 타입을 표현할 때 스타 프로젝션(*)을 쓴다.

```kotlin
inline fun <reified T> someMethod(value: Any){
    if (value is T){ }
}
```

제네릭 함수가 호출되어도 그 함수의 본문에서는 호출 시에 쓰인 타입 인자를 알 수 없다.

타입 인자를 본문에서 호출하기 위해서는 함수를 inline으로 선언하고 타입 인자에 reified를 사용하여야 한다.

reified 키워드는 타입 인자가 실행 시점에서 지워지지 않음을 뜻하며 타입 파라미터를 실체화했다고 한다.

실체화한 파라미터는

- 타입 검사, 캐스팅(is, as)
- 코틀린 리플렉션 API
- 타입에 대응하는 java.lang.Class 얻기(::class.java)
- 다른 함수를 호출할 때 인자로 사용

은 가능하지만

- 해당 타입 클래스의 인스턴스 생성
- 해당 클래스의 동반 객체 메소드 호출
- 실체화한 타입 파라미터를 요구하는 함수를 호출하면서 실체화하지 않은 타입 파라미터로 받은 타입을 넘기기
- 인라인 함수가 아닌 함수의 타입 파라미터를 reified로 지정

은 불가능하다.

### 변성

변성이란 기저 타입이 같고 타입 인자가 다른 여러 타입의 관계를 설명하는 개념이다.

<Any>인 타입에 <String>을 넘길 수 있다. 하지만 이는 안전하다고 할 수 없다.

#### 클래스, 타입, 하위 타입

클래스와 타입은 다르다.

하나의 String 클래스로, String과 String? 두 가지 타입이 만들어진다.

제네릭 클래스의 경우 하나의 List 클래스로 List<Int>,List<String> 등 무수히 많은 타입을 만들 수 있다.

타입 사이의 관계를 논하기 위해서는 상위, 하위 타입 개념을 이해해야 한다.

```kotlin
val number: Number
val string: String
number = 1 //right way
string = 1 //wrong way
```

예를 들어 Int는 Number의 하위 타입이며 당연하게게도 Number는  Int의 상위 타입이다.

어떤 값의 타입이 해당 변수의 하위 타입일 경우에만 변수에 대입할 수 있다.

하위 타입은 근본적으로 하위 클래스와 같다.

널이 될 수 없는 타입은 널이 될 수 있는 타입의 하위 타입이다. (하지만 같은 클래스이다.)

#### 무공변

제네릭에서 아무런 관계가 성립하지 않는 것을 무공변이라고 한다. 제네릭은 기본적으로 무공변적이다.

#### 공변

```kotlin
open class Animal{}
open class Bird:Animal(){}
class Penguin:Bird(){}

class Zoo<out T:Animal>(){
    val animals= listOf<T>()
    
    fun getAnimal():T{
        return animals[0]
    } //right way
  
    fun setAnimal(animal: T){
        
    } //bad way
}
```

제네릭에서 자신의 하위 타입까지 허용하는 것을 공변이라고 한다.

공변적임을 표시하기 위해서 파라미터 이름 앞에 out을 붙인다.

예시에서 Zoo는 Animal 타입에 대해 공변적이므로 Zoo<Animal>는 Zoo<Bird>의 상위 타입이라는 뜻이다.

타입 인자가 공변적일 때 그 인자는 반환형으로만 사용 가능하다.

#### 반공변

```kotlin
class Zoo2<in T:Bird>(){
    private val animals= arrayListOf<T>()

    fun setAnimal(animal: T){}
}
```

반공변은 제네릭의 타입 인자의 연관성이 실제 타입의 반대가 되는 것이다.

Zoo2<Bird>는 Zoo2<Penguin>의 하위 타입이 된다.

타입인자가 반공변적일 때 그 인자는 파라미터로만 사용 가능하다.

## 어노테이션

어노테이션은 @과 이름으로 이루어진다.

어노테이션을 적용하기 위해선 대상 앞에 어노테이션을 붙이면 된다.

```kotlin
@Deprecated("remove(index) is deprecated use removeAt(index) instead",replaceWith = ReplaceWith("removeAt(index)"))
fun remove(index:Int){
    
}
```

위 예제는 remove 함수가 선언되면 함수에 대해 경고 메세지를 표시해주고 그 코드를 ReplaceWith 코드로 바꿔주는 기능을 한다.

### 어노테이션 인자

어노테이션의 괄호 안에 인자를 넘길 수 있다.

어노테이션 인자의 규칙은 다음과 같다.

- 클래스를 넘길 때에는 class이름::class의 형태로 넘긴다.
- 다른 어노테이션을 넘길 때에는 넘기는 어노테이션의 @를 넣지 않아야 한다. (위 예제의  ReplaceWIth는 어노테이션이지만 인자이기 때문에 @를 사용하지 않는다.)
- 배열은 인자로 넣으려면 arrayOf 함수를 사용한다.
- 어노테이션 인자는 컴파일 시점에서 알 수 있어야 한다. (const가 아닌 일반 프로퍼티를 넣을 수 없다.)

### 어노테이션 대상

```kotlin
@get:어노테이션 이름
var a : Int=0
```

사용 지점 대상 선언으로 어노테이션을 특정 대상에만 붙일 수 있다.

사용 지점 대상은 @와 어노테이션 이름 사이에 붙고 :으로 구분한다.

위 예제에서는 a의 게터에서 어노테이션을 적용하겠다는 말이다.

사용 지점 대상의 목록은 다음과 같다

| 이름     | 대상                                                      |
| -------- | --------------------------------------------------------- |
| property | 프로퍼티 전체                                             |
| field    | 프로퍼티에 의해 생성되는 필드                             |
| get      | 게터                                                      |
| set      | 세터                                                      |
| receiver | 확장 함수나 프로퍼티의 수신 객체 파라미터                 |
| param    | 생성자 파라미터                                           |
| setparam | 세터 파라미터                                             |
| delegate | 위임 프로퍼티의 위임 인스턴스를 담아둔 필드               |
| file     | 파일 안에 선언된 최상위 함수와 프로퍼티를 담아두는 클래스 |

### 어노테이션 선언

```kotlin
annotation class JsonExclude(val name: String)
```

class 앞에 annotation 키워드를 사용하여 어노테이션 클래스를 선언할 수 있다.

어노테이션 클래스는 오직 선언과 식과 관련있는 메타데이터의 구조를 정의하기 때문에 내부에 아무 코드도 들어있을 수 없다.

파라미터가 있는 어노테이션을 정의하려면 주 생성자 선언 구문을 사용한다. (무조건 val로 선언해야 한다.)

### 메타 어노테이션

```kotlin
@Target(AnnotationTarget.ANNOTATION_CLASS)
annotation class JsonExclude(val name: String) //어노테이션을 적용할 수 있는 요소의 유형을 클래스로 지정한다.
```

어노테이션 클래스에 붙는 어노테이션을 메타 어노테이션이라고 한다.

Target 어노테이션은 어노테이션을 적용할 수 있는 요소의 유형을 지정한다.

### 파라미터

어노테이션 파라미터로 클래스를 넣고 싶을 때는 클래스 위에 ::class 키워드를 붙인다.

이는 KClass로 java.lang.Class 타입과 같은 역할을 한다.

제네릭 클래스를 인자로 받아야 한다면 KClass<out 허용할 클래스 이름<*>>을 사용한다.

## DSL

DSL(Domain Specific Language)는 영역 특화 언어이며 이를 사용해 표현력이 좋고 코틀린다운 API를 설게할 수 있다.

우리의 궁극적인 목표는 코드의 가독성과 유지 보수성을 가장 좋게 유지하는 것이다.

클래스의 코드 중 대부분은 다른 클래스와 상호작용하므로 이 연결 지점(Interface, API)을 잘 살펴봐야 한다.

깔끔한 API란 간결해야하고 읽는 사람이 명확하게 이해할 수 있어야 한다.

깔끔한 API 작성을 위해 돕는 코틀린의 기능에는 이제껏 배운 확장 함수, 중위 함수, 람다(it 사용 등의 편의), 연산자 오버로딩 등이 있다.

### 영역 특화 언어

예로부터 프로그래밍 언어는 컴퓨터의 모든 문제를 풀 수 있는 범용 프로그래밍 언어와 특정 영역에 초점을 맞춘 영역 특화 언어를 구분해왔다.

가장 익숙한 영역 특화 언어는 SQL이나 정규식을 예로 들 수 있다.

SQL과 정규식은 데이터 베이스 조작, 문자열 조작 등의 기능을 할 수 있으나 전체 에플리케이션을 구성하는 일은 없다.

DSL은 범용 프로그래밍 언어보다 더 선언적이다.

DSL은 자체 문법이 있기 때문에 다른 언어의 프로그램 안에 직접 포함시킬 수 없다.

### 내부 DSL

독립적인 문법을 가진 외부 DSL과는 다르게 내부 DSL은 범용 언어로 작성된 프로그램의 일부이며 범용 언어와 동일한 문법을 사용한다.

특정 목적을 위한 코드이지만 범용 언어의 라이브러리로 구성된다.

전형적인 라이브러리는 여러 메소드로 이루어져 한 번에 하나 씩 호출하며 호출 사이의 아무 관계가 존재하지 않는다.(명령 - 질의)

DSL의 메소드 호출은  DSL문법에 의해 정해지는데 보통 람다를 중첩시키거나 메소드 호출을 연쇄시키는 방식으로 구조를 만든다.

>고차함수에서 함수를 인자로 받을 때 확장 함수를 사용하여 불필요한 it호출을 줄일 수 있다.

## Coroutine

```kotlin
fun log(msg: String) = println("${java.lang.Thread.currentThread()} : $msg")
fun launchGlobalScope() {
    GlobalScope.launch {
        log("coroutine is started")
    }
}

fun main() {
    log("main start")
    launchGlobalScope()
    log("function is executed")
    Thread.sleep(5000L)
    log("main terminate")
}

//Thread[main,5,main] : main start
//Thread[main,5,main] : coroutine is started
//Thread[main,5,main] : function is executed
//Thread[main,5,main] : main terminate
```

코루틴은 실행을 주고 받으며 작동하는 여러 서브 루틴을 말한다.

launch는 코루틴을 잡으로 반환하며, 만들어진 코루틴은 즉시 실행된다.

launch가 반환한 Job의 cancel() 메소드를 호출하여 코루틴 실행을 중단시킬 수 있다.

메인 함수와 코루틴은 서로 다른 스레드에서 실행된다.

GlobalScope는 메인 스레드가 실행 중인 동안만 코루틴의 동작을 보장한다.

### runBlocking

```kotlin
fun launchRunBlocking(){
    runBlocking {
        launch {
            log("coroutine is started")
        }
    }
}
```

runBlocking()은 코루틴의 실행이 끝날 때까지 현재 스레드를 블록시킨다.

### yield

```kotlin
fun testYield(){
    runBlocking {
        launch {
            log("1")
            yield()
            log("3")
            yield()
            log("5")
        }
        log("after first launch")
        launch {
            log("2")
            delay(1000L)
            log("4")
            delay(1000L)
            log("6")
        }
    }
}
//Thread[main,5,main] : 1
//Thread[main,5,main] : 2
//Thread[main,5,main] : 3
//Thread[main,5,main] : 5
//Thread[main,5,main] : 4
//Thread[main,5,main] : 6

```

launch는 즉시 반환된다.

runBlocking은 내부 코루틴이 모두 끝난 다음에 반환된다.

delay()를 사용한 코루틴은 그 시간이 지날 때까지 다른 코루틴에게 실행을 양보한다.

yield()는 현재 코루틴을 일시 정지하고 값을 반환한다.

### async

```kotlin
fun testAsync() = runBlocking {
    val def1 = async {
        log("async start")
        3
    }
    val def2 = async {
        log("async2 start")
        1
    }
    println(def1.await() + def2.await())
}
```

async는 launch와 같은 역할을 하지만 Job이 아닌  Deffered를 반환한다.

Deffered는  Job을 상속받고 타입 파라미터가 있으며 이는 Deffered 코루틴이 계산을 하고 돌려주는 값의 타입이다. 코루틴의 결과 값을 기다는 await()함수가 포함되어 있다.

async와 launch 모두 CoroutineScope의 확장 함수이며  CoroutineScope에는 CoroutineContext 타입의 필드가 있다.

CoroutineContext는 코루틴이 실행 중인 작업(Job)과 디스패처를 저장하는 일종의 맵이다.

### Coroutine Builder & suspending function

launch, async, runBlocking같은 함수들은 코루틴을 만들어주는 코루틴 빌더라고 한다.

코루틴 빌더는 그 외에도 produce, actor 등이 있다.

delay()와  yield()는 일시 중단 함수라고 부른다,

일시 중단 함수에는 그 외에도 withContext. withTimeout. withTimeoutOrNull, awiltAll, joinAll 등이 있다.

### suspend

일시 중단 함수는 코루틴이나 다른 일시 중단 함수에서만 사용해야 한다.

suspend 키워드를 사용하면 일반 함수도 일시 정지 함수로 만들 수 있다.

---

> 출처 : Kotlin In Action(드미트리 제메로프, 스베트라나 이사코바)

