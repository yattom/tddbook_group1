# Java+JUnit5のRepl

このReplではJUnit5を使ったテストを実行できます。

"Run"ボタンでテストを実行します。コンソールでmvn testを実行するのと同じです。

ディレクトリ構成はmavenに従うので、プロダクトコードはsrc/main/javaに、テストコードはsrc/test/javaに配置してください。

packageを追加したときは、コンソールからmvn eclipse:eclipseを実行して、.projectと.classpathファイルを更新してください。そうしないと、コード補完などが効かない場合があります。

## TODOリスト

### Chapter 12から

書籍では、Chapter12で新しくTODOリストを作り直しました

- [ ] $5 + 10 CHF = $10 (レートが2:1の場合)
- [x] $5 + $5 = $10
- [ ] $5 + $5がMoneyを返す
- [x] Bank.reduce(Money)
- [x] Moneyを変換して換算を行う
- [x] Reduce(Bank, String)
- [ ] Sum.plus()
- [ ] Expression.times()

### Chapter 11まで

- [ ] $5 + 10 CHF = $10 (レートが2:1の場合)
- [x] $5*2 = $10
- [x] amountをprivateにする
- [x] Dollarの副作用どうする？
- [ ] Moneyを丸処理どうする？
- [x] equals()
- [ ] hashCode()
- [ ] nullとの等価性比較
- [ ] 他のオブジェクトとの等価性比較
- [x] 5CHF*2=10CHF
- [x] DollarとFrancの重複
- [x] equals()の一般化
- [x] timesの一般化
- [x] FrancとDollarを比較する
- [x] 通貨の概念
- [x] testFrancMultiplicationを削除する？


# モブの順番

## 2023.05.26
- あきら
- yattom
- masashi
- じん
- 401
- てらひで

## 2023.05.12
- じん
- あきら
- てらひで
- masashi
- yattom
- 円城寺

## 2023.04.21
- じん
- あきら
- てらひで
- 401
- masashi

## 2023.04.07
- Kubo
- てらひで
- 401
- じん
- masashi
- 円城寺

## 2023.3.17
- てらひで
- じん
- 円城寺
- kubo
- masashi

## 2023.2.17
- 宮崎
- くぼ
- Hirai
- やっとむ

## 2023.2.3
- やっとむ
- くぼ
- 平井
- 植村

## 2023.1.20
- くぼ
- 植村
- 円城寺
- Hirai
- Yattom

