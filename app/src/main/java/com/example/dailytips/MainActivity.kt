package com.example.dailytips

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dailytips.DTO.Tip

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adviceList = listOf(
            Tip("Начинайте утро с благодарности", R.drawable.tip1,
                "Как только проснётесь, подумайте о трёх вещах, за которые вы благодарны. Это может быть что-то простое: " +
                        "солнечное утро, тепло любимого чая или объятие близкого человека. Такой настрой задаст положительный тон всему дню"),
            Tip("Двигайтесь и улыбайтесь", R.drawable.tip2,
                "Сделайте лёгкую зарядку, потанцуйте под любимую песню или просто прогуляйтесь на свежем воздухе. " +
                        "Движение запускает выработку эндорфинов, а улыбка (даже если сначала она \"на заказ\") помогает улучшить настроение"),
            Tip("Дарите добро и мелкие радости", R.drawable.tip3,
                "Позвольте себе сделать что-то приятное для других: скажите тёплое слово коллеге, " +
                        "помогите кому-то с небольшой просьбой или просто искренне улыбнитесь прохожему. Такие маленькие жесты делают мир вокруг вас светлее"),
            Tip("Отмечайте свои победы", R.drawable.tip4,
                "Даже если они кажутся незначительными. Завершили маленькое дело? " +
                        "Похвалите себя! Запишите свои достижения в дневник или мысленно порадуйтесь. Это укрепляет уверенность и добавляет чувство удовлетворения"),
            Tip("Найдите момент для удовольствия", R.drawable.tip5,
                "Каждый день уделяйте хотя бы 10-15 минут тому, что приносит вам удовольствие: " +
                        "чтению книги, чашке кофе в тишине, просмотру любимого фильма или хобби. Это время — ваша инвестиция в гармонию с собой")
        )

        findViewById<RecyclerView>(R.id.adviceList).apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = TipInitializer(adviceList)
        }
    }
}
