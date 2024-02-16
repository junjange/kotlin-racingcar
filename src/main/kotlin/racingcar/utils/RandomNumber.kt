package racingcar.utils

import racingcar.model.RacingCarGame

object RandomNumber {
    fun getRandomNumber(): Int = (RacingCarGame.MIN_MOVE_NUMBER..RacingCarGame.MAX_MOVE_NUMBER).random()
}
