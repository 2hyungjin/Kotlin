

# Kotlin

코틀린에 대한 이해가 부족하고 더 **코틀린 다운 코드**를 짜고 싶어서 코틀린 컴파일러 개발자가 쓴  **"Kotlin In Action"** 책을 읽게 되었습니다.

밑의 내용은 이 책을 읽고 내가 이해하며 정리한 내용이며 더 자세한 내용은 책을 구입하여 읽어보시길 바랍니다.

- 코틀린은 **간결하고 실용적**이며 **자바 코드와의 상호운용성**을 중시한다.
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

코틀린은 표준 자바 컬렉션을 활용하여 자바 코드와 상요작용하기 쉽게 한다.

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

map을 생성할 때 사용하는 to라는 단어는 주위 호출이라는 방식으로 불러온 일반 메소드이다.

중위 호출 시에는 수신 객체와 유일한 메소드 인자 사이에 메소드 이름을 넣는다.

```kotlin
val map= mapOf<Int,String>(1 to "one", 2.to("two"))
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

생성자 파라미터에 val을 추가하는 방식으로 정의와 초기화를 간략히 쓸 수 있다.

생성자 파라미터에도 디폴트 값을 정의할 수 있다.

```kotlin
open class Student constructor(val id: Int, val name: String)
class SecondGradeStudent(id: Int, name: String, major: String) : Student(id, name)
```

클래스에 기반 클래스가 있다면 주 생성자에서 기반 클래스의 생성자를 호출해야 한다.

기반 클래스를 초기화하기 위해 키반 클래스 이름 뒤에 생성자 인자를 넘긴다.

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

커스텀 세터의 fieled는 기존의 값, set 뒤의 괄호(위 코드에서는 value)는 들어온 값을 의미한다.

접근자에서는 field 식별자를 통해 뒷받침하는 필드에 접근할 수 있다. 게터에서는 읽을 수만 있고, 세터에서는 읽고 쓸 수 있다.

접근자에 가시성을 넣어 외부에서 해당 프로퍼티으 ㅣ수정을 막을 수 있다.

### 데이터 클래스와 클래스 위임

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

---

> 출처 : Kotlin In Action(드미트리 제메로프, 스베트라나 이사코바)

