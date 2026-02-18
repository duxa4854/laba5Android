import com.zastavnaya.tip_time_theme.calculateTip
import org.junit.Assert.assertEquals
import org.junit.Test
import java.text.NumberFormat


class TipCalculatorTests {
    @Test
    fun calculateTip_20PercentNoRoundup(){
        val amount = 10.00
        val tipPercent = 20.00
        val exceptedTip = NumberFormat.getCurrencyInstance().format(2)
        val actualTip = calculateTip(amount = amount, tipPercent=tipPercent, false)
        assertEquals(exceptedTip,actualTip)
    }
}