package www.harunmese.dev.bottomsheet

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import com.google.android.material.bottomsheet.BottomSheetBehavior
import www.harunmese.dev.bottomsheet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Bottom sheet behavior'ını tanımla
        val bottomSheetBehavior = BottomSheetBehavior.from(binding.bottomSheet)

        // Bottom sheet'in açılıp kapanmasını dinle
        bottomSheetBehavior.addBottomSheetCallback(object : BottomSheetBehavior.BottomSheetCallback() {
            override fun onStateChanged(bottomSheet: View, newState: Int) {
                // Durum değişikliğini burada işleyebilirsiniz
            }

            override fun onSlide(bottomSheet: View, slideOffset: Float) {
                // Kaydırma olayını burada işleyebilirsiniz
            }
        })

        bottomSheetBehavior.state = BottomSheetBehavior.STATE_HIDDEN

        // Bottom sheet'i aç veya kapat
       binding.toggleButton.setOnClickListener {
            if (bottomSheetBehavior.state == BottomSheetBehavior.STATE_HIDDEN) {
                bottomSheetBehavior.state = BottomSheetBehavior.STATE_EXPANDED
            } else {
                bottomSheetBehavior.state = BottomSheetBehavior.STATE_HIDDEN
            }
        }

        binding.bb.setOnClickListener {
            if (binding.textView.text == "Changed Text") {
                binding.textView.text = "Bottom Sheet Behavior"
            } else {
                binding.textView.text = "Changed Text"
            }
        }




    }



}
