package poker;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
TODO
- [ ] 役判定
  - [ ] ぶた
  - [ ] ワンペア
  - [ ] スリーカード
  - [ ] ツーペア
  - [ ] ストレート
  - [ ] フラッシュ
  - [ ] フルハウス
  - [ ] フォーカード
  - [ ] ストレートフラッシュ
  - [ ] ファイブカード
  - [ ] ロイヤルストレートフラッシュ
*/

public class PokerTest{
  @Test
  public void testNoPair(){
    Hand sut = new Hand("c3","dJ","h4","sA","c2");
    String actual = sut.judgeRank();
    assertEquals("No Pair", actual);
  }
}