package baseball.Game;

import camp.nextstep.edu.missionutils.Randoms;

public class Number {

    public int getRandomNum(int len, int MIN_NUM, int MAX_NUM) {
        int num = 0;

        for (int i = 0; i < len; i++){
            num *= 10;
            num += Randoms.pickNumberInRange(MIN_NUM, MAX_NUM);
        }
        return num;
    }

}
