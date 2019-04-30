package net.benelog.blog.migration

import org.assertj.core.api.AssertionsForClassTypes.assertThat
import org.junit.jupiter.api.Test

import java.time.LocalDateTime

internal class DateTimesTest {

    @Test
    fun fromSeoulToUtc() {
        val seoulLocalTime = LocalDateTime.of(2019, 4, 28, 0, 0)
        val utcZonedTime = DateTimes.fromSeoulToUtc(seoulLocalTime)
        assertThat(utcZonedTime.toString()).isEqualTo("2019-04-27T15:00Z")
    }
}
