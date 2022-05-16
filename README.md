# 로또
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

## 프로그래밍 요구사항
    *모든 기능을 TDD로 구현해 단위 테스트가 존재해야 한다. 단, UI(System.out, System.in) 로직은 제외
    *java enum을 적용해 프로그래밍을 구현한다.
    *규칙 8: 일급 콜렉션을 쓴다.
    *indent(인덴트, 들여쓰기) depth를 2를 넘지 않도록 구현한다. 1까지만 허용한다.
    *함수(또는 메소드)의 길이가 15라인을 넘어가지 않도록 구현한다.
    *자바 코드 컨벤션을 지키면서 프로그래밍한다.
    *else 예약어를 쓰지 않는다.

## 힌트
    *로또 자동 생성은 Collections.shuffle() 메소드 활용한다.
    *Collections.sort() 메소드를 활용해 정렬 가능하다.
    *ArrayList의 contains() 메소드를 활용하면 어떤 값이 존재하는지 유무를 판단할 수 있다.
    *로또 1장의 가격은 1000원
    *일급 콜렉션을 쓴다.
    *6개의 숫자 값을 가지는 java collection을 감싸는 객체를 추가해 구현해 본다.
    *하드 코딩을 하지 않기 위해 상수 값을 사용하면 많은 상수 값이 발생한다. 자바의 enum을 활용해 상수 값을 제거한다. 즉, enum을 활용해 일치하는 수를 로또 등수로 변경해 본다.

## 도메인 
    * 게임 UI 
    * 로또 구입
    * 로또번호 생성기 (자동)
    * 로또번호 비교
    * 당첨 통계 (리스트, 수익률)

## UI예시
```
구입금액을 입력해 주세요.
14000
14개를 구매했습니다.
[8, 21, 23, 41, 42, 43]
[3, 5, 11, 16, 32, 38]
[7, 11, 16, 35, 36, 44]
[1, 8, 11, 31, 41, 42]
[13, 14, 16, 38, 42, 45]
[7, 11, 30, 40, 42, 43]
[2, 13, 22, 32, 38, 45]
[23, 25, 33, 36, 39, 41]
[1, 3, 5, 14, 22, 45]
[5, 9, 38, 41, 43, 44]
[2, 8, 9, 18, 19, 21]
[13, 14, 18, 21, 23, 35]
[17, 21, 29, 37, 42, 45]
[3, 8, 27, 30, 35, 44]

지난 주 당첨 번호를 입력해 주세요.
1, 2, 3, 4, 5, 6
보너스 볼을 입력해 주세요.
7

당첨 통계
---------
3개 일치 (5000원)- 1개
4개 일치 (50000원)- 0개
5개 일치 (1500000원)- 0개
5개 일치, 보너스 볼 일치(30000000원) - 0개
6개 일치 (2000000000원)- 0개
총 수익률은 0.35입니다.(기준이 1이기 때문에 결과적으로 손해라는 의미임)      
```

## 기능 목록
### 로또 모델 구현
    [X] 한자리 로또번호 모델을 구현한다.
    [X] 로또번호의 범위는 1~45다.
    [X] 6자리 로또번호 모델을 구현한다.
    [X] 로또번호는 중복된 숫자가 입력되면 안된다.
     
### 로또 생성기
    [X] 중복없는 로또번호를 생성한다.
    [X] Collections.shuffle()을 활용한다.

### 당첨 확인 (통계)
    [X] 당첨내역을 관리하는 모델을 구현한다.
    [X] 당첨여부를 확인한다.
    [X] ArrayList의 contains() 메소드를 활용해본다.
    [X] 등수별 당첨 리스트를 구하는 기능을 구현한다.
    [X] 등수별 당첨 금액리스트를 구현한다.
    [X] 구입금액과 당첨금을 비교해 수익률을 계산한다. (당첨금액 / 구입금액)

### 로또 구입
    [X] 금액에 맞게 로또를 구입하는 기능을 구현한다. ( 로또 금액은 1,000원 )

### UI
    [X] 로또 구입금액을 입력받는다.
    [X] 금액에 맞게 자동로또를 구입한다.
    [X] 지난주 당첨번호를 입력받는다. (구분자 "," 곰백제거)
    [X] 3~6개 맞춘 로또번호의 갯수, 등수별 금액, 수익률을 출력한다.

###추가기능
    [ ] 로또 2등추가
    [ ] 보너스볼 입력, 보너스 출력, 통계에 보너스 값 추가
    [ ] "보너스 볼을 입력해 주세요. " 메시지 출력 후 입력받는다.
    [ ] 5개 일치, 보너스 볼 일치(30000000원) - 0개 ( 로또 출력 )
    