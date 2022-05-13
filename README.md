# 로또
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

## 힌트
    *로또 자동 생성은 Collections.shuffle() 메소드 활용한다.
    *Collections.sort() 메소드를 활용해 정렬 가능하다.
    *ArrayList의 contains() 메소드를 활용하면 어떤 값이 존재하는지 유무를 판단할 수 있다.
    *로또 1장의 가격은 1000원

## 도메인 
    * 게임 UI 
    * 로또 구입
    * 로또번호 생성기 (자동)
    * 로또번호 비교
    * 당첨 통계 (리스트, 수익률)
      
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
    [ ] 테스트코드 작성

### 로또 구입
    [X] 금액에 맞게 로또를 구입하는 기능을 구현한다. ( 로또 금액은 1,000원 )

### UI
    [X] 로또 구입금액을 입력받는다.
    [X] 금액에 맞게 자동로또를 구입한다.
    [X] 지난주 당첨번호를 입력받는다. (구분자 "," 곰백제거)
    [X] 3~6개 맞춘 로또번호의 갯수, 등수별 금액, 수익률을 출력한다.

### 남은 리뷰사항
    [ ] UI ResultView, InputView 클래스분할
    [ ] 테스트 코드 given-when-then 패턴 사용
    