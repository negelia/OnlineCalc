package com.example.onlinecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.Button;
import android.widget.TextView;

public class EndTest extends AppCompatActivity {

    TextView textView1;
    TextView textView2;
    TextView textView3;
    Button btn;
    String rezult = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_test);

        Bundle argument = getIntent().getExtras();
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(android.R.color.holo_green_dark)));
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        btn = findViewById(R.id.Btn);
        SharedPreferences pref= PreferenceManager.getDefaultSharedPreferences(EndTest.this);
        SharedPreferences.Editor editor=pref.edit();
        switch (argument.get("test").toString())
        {
            case "1":
                rezult = argument.get("rezult").toString();
                textView1.setText("Ваш результат: "+rezult);
                if(Integer.parseInt(rezult)<=18.5)
                    textView2.setText("Наблюдается недостаток массы тела");
                if(Integer.parseInt(rezult)>18.5&&Integer.parseInt(rezult)<=25)
                    textView2.setText("Норма");
                if(Integer.parseInt(rezult)>25&&Integer.parseInt(rezult)<=30)
                    textView2.setText("Избыточная масса тела");
                if(Integer.parseInt(rezult)>30&&Integer.parseInt(rezult)<=35)
                    textView2.setText("Первая степень ожирения");
                if(Integer.parseInt(rezult)>35&&Integer.parseInt(rezult)<=40)
                    textView2.setText("Вторая степень ожирения");
                if(Integer.parseInt(rezult)>40)
                    textView2.setText("Третья степень ожирения");
                textView3.setText("- 16-18,5 кг/м2 и менее, то наблюдается недостаток массы тела, - 18,5-25 кг/м2 – норма, 25-30 кг/м2 – избыточная масса тела, 30-35 кг/м2 – первая степень ожирения, 35-40 кг/м2 – вторая степень ожирения, свыше 40 кг/м2 – третья степень ожирения. - индекс не учитывает пол, возраст, распределение в организме жирового и мышечного компонента тела" +
                        "- средние значения индекса, полученные в РЭУ им. Г.В. Плеханова составили у девушек – 19-23 кг/м2, у юношей 20-23 кг/м2 " +
                        "- у представителей молодого возраста (до 30 лет) индекс массы тела ниже по сравнению с представителями среднего возраста " +
                        "- для поддержания оптимальной массы тела необходимо ходить не менее 10 тысяч шагов в сутки " +
                        "- по индексу массы тела можно лишь косвенно судить о норме, недостатке или избыточной массе тела " +
                        "- при индексе свыше 25 кг/м2 необходимо подключить онлайн-калькулятор питания и контролировать полученные калории, увеличить прогулки на свежем воздухе, ограничить хлебобулочные изделия");
                editor.putString("one",textView1.getText().toString()+"\n"+textView2.getText().toString());
                break;
            case "2":
                rezult = argument.get("rezult").toString();
                textView1.setText(new StringBuilder().append("Ваш результат: ").append(Integer.parseInt(rezult) * 365).toString());
                textView1.setText(textView1.getText().toString()+" шагов в год");
                if(Integer.parseInt(rezult)<7500)
                    textView2.setText("«Сидячая работа»");
                if(Integer.parseInt(rezult)>=7500&&Integer.parseInt(rezult)<10000)
                    textView2.setText("«Несколько активная работа»");
                if(Integer.parseInt(rezult)>=10000&&Integer.parseInt(rezult)<12500)
                    textView2.setText("«Активный образ жизни»");
                if(Integer.parseInt(rezult)>=12500)
                    textView2.setText("«Очень активный образ жизни»");
                textView3.setText("<5000 шагов в день – «сидячая работа»; \n" +
                        "7500-9999 шагов в день – «несколько активная работа»; \n" +
                        "10-12 тыс. шагов – «активный образ жизни»; \n" +
                        "свыше 12,5 тыс. шагов – «очень активный образ жизни»\n");
                editor.putString("two",textView1.getText().toString()+"\n"+textView2.getText().toString());
                break;
            case "3":
                rezult = argument.get("rezult").toString();
                textView1.setText("Ваш результат: "+rezult);
                if (Integer.parseInt(rezult) < 16)
                    textView2.setText("Усиление кардиореспираторной системы");
                if (Integer.parseInt(rezult) > 16)
                    textView2.setText("Ослабление деятельности сердечно-сосудистой системы или детренированность обследуемого");
                if (Integer.parseInt(rezult) == 16)
                    textView2.setText("Норма");
                textView3.setText("В норме коэффициент выносливости – 16 усл. ед., " +
                        "- результат меньше 16 усл. ед. свидетельствует об усилении кардиореспираторной системы" +
                        "- увеличение указывает на ослабление деятельности сердечно-сосудистой системы или детренированности обследуемого" +
                        "- при занятиях спортом коэффициент выносливости может быть ниже 16 усл.ед., из-за укрепления сердечно-сосудистой системы, коэффициент выносливости коррелирует с уровнем физической работоспособности организма " +
                        "- пульсовое давление ПД (САД-ДАД), необходимое для подсчета коэффициента выносливости в среднем составляет 40 мм рт.ст. " +
                        "- функционирование сердечно-сосудистой системы можно представить " +
                        "как причинно-следственный процесс причиной (входом) которого является " +
                        "систолическое АД (САД), а следствием (выходом) – диастолическое АД (ДАД), зависимость выхода от входа опосредуется через пульсовое давление ПД= САД – ДАД " +
                        "- ПД (пульсовое давление) является переходной функцией (оператором) " +
                        "нейрогуморальной регуляции кровообращения. " +
                        "- для улучшения коэффициента выносливости сердечно-сосудистой системы следует заниматься ФКиС не менее трех раз в неделю, совершать 10-12,5 тысяч шагов в сутки ");
                editor.putString("three",textView1.getText().toString()+"\n"+textView2.getText().toString());
                break;
            case "4":
                rezult = argument.get("rezult").toString();
                textView1.setText("Ваш результат: "+rezult);
                if(Integer.parseInt(rezult)<=74)
                    textView2.setText("Высокий уровень регуляции сердечно-сосудистой системы");
                if(Integer.parseInt(rezult)>74&&Integer.parseInt(rezult)<=80)
                    textView2.setText("Выше среднего");
                if(Integer.parseInt(rezult)>80&&Integer.parseInt(rezult)<=90)
                    textView2.setText("Средний");
                if(Integer.parseInt(rezult)>90&&Integer.parseInt(rezult)<=100)
                    textView2.setText("Ниже среднего");
                if(Integer.parseInt(rezult)>100)
                    textView2.setText("Низкое значение регуляции");
                textView3.setText("до 74 усл. ед. – высокий уровень регуляции сердечно-сосудистой системы; \n" +
                        "75-80 – выше среднего; \n" +
                        "81-90 – средний; \n" +
                        "91-100 – ниже среднего; \n" +
                        "101 и выше – низкое значение регуляции. \n" +
                        "- показатели регуляции сердечно-сосудистой системы у спортсменов ниже, чем у нетренированных лиц, так как сердце спортсмена в условиях покоя работает в более экономичном режиме, при меньшем потреблении кислорода.\n" +
                        "индекс используется для косвенного определения степени обеспеченности миокарда кислородом\n" +
                        "- результаты индекса на студентах РЭУ им. Г.В. Плеханова: \n" +
                        "девушки 90-101 усл. ед., юноши 92,3-96 усл. ед\n" +
                        "- в процессе регулярных занятий ФКиС значения индекса постепенно снижаются, и могут достигать среднего, выше среднего и высокого уровня регуляции сердечно-сосудистой системы\n");
                editor.putString("four",textView1.getText().toString()+"\n"+textView2.getText().toString());
                break;
            case "5":
                rezult = argument.get("rezult").toString();
                textView1.setText("Ваш результат: "+rezult);
                if(Integer.parseInt(rezult)>49&&Integer.parseInt(rezult)<=61)
                    textView2.setText("Норма");
                if(Integer.parseInt(rezult)>61)
                    textView2.setText("Выше среднего");
                if(Integer.parseInt(rezult)<50)
                    textView2.setText("Ниже среднего");
                textView3.setText("- норма 50-61 мл/кг; если показатель меньше, то это может свидетельствовать о недостаточности кислород обеспечения организма, недостаточной жизненной емкости легких, либо избыточной массе тела " +
                        "- для обследуемых, имеющих жизненный индекс ниже нормы рекомендуются физические упражнения средней интенсивности, наряду с этим допускается чередование высокоинтенсивных (молодой и средний возраст) и малоинтенсивных тренировочных нагрузок." +
                        "- на увеличение жизненной емкости легких влияют регулярные занятия физической культурой и спортом, особенно занятия аэробной направленности (бег, велопрогулки, плавание, аэробика, работа на кардиотренажерах, спортивные игры и другие)." +
                        "-при большой жизненной емкости (ЖЕЛ) легкие лучше вентилируются и организм получает больше кислорода. Норма ЖЕЛ у мужчин 3500-5000 мл, у женщин 2500-4000 мл. В исследовании РЭУ им. Г.В. Плеханова ЖЕЖ у девушек 2100-2600 мл, у юношей 3800-4150 мл." +
                        "-у лиц, не занимающихся физической культурой и спортом чаще всего, жизненная емкость легких ниже по сравнению с лицами регулярно занимающимися ФКиС" +
                        "- жизненный индекс на 10-12% ниже у лиц имеющих избыточную массу тела\n");
                editor.putString("five",textView1.getText().toString()+"\n"+textView2.getText().toString());
                break;
            case "6":
                rezult = argument.get("rezult").toString();
                textView1.setText("Ваш результат: "+rezult);
                if(Integer.parseInt(rezult)<5)
                    textView2.setText("Очень плохо (низкий уровень выносливость сердечно-сосудистой и дыхательной систем)");
                if(Integer.parseInt(rezult)>=5&&Integer.parseInt(rezult)<=10)
                    textView2.setText("Неудовлетворительно");
                if(Integer.parseInt(rezult)>10&&Integer.parseInt(rezult)<=30)
                    textView2.setText("Удовлетворительно");
                if(Integer.parseInt(rezult)>30&&Integer.parseInt(rezult)<=60)
                    textView2.setText("Хорошо");
                if(Integer.parseInt(rezult)>60)
                    textView2.setText("Очень хорошо (высокий уровень выносливости)");
                textView3.setText("Оценка индекса: \n" +
                        "<5 усл. ед. – очень плохо (низкий уровень выносливость сердечно-сосудистой и дыхательной систем), \n" +
                        "5-10 – неудовлетворительно, \n" +
                        "10-30 – удовлетворительно, \n" +
                        "30-60 – хорошо,\n" +
                        " > 60 – очень хорошо (высокий уровень выносливости). \n" +
                        "- проба Штанге (с), определяющая гипоксическую устойчивость организма (время задержки дыхания на вдохе). \n" +
                        "- индекс Скибински характеризует состояние сердечно-сосудистой и дыхательной систем.\n");
                editor.putString("six",textView1.getText().toString()+"\n"+textView2.getText().toString());
                break;
            case "7":
                rezult = argument.get("rezult").toString();
                textView1.setText("Ваш результат: "+rezult);
                if(Double.parseDouble(rezult)>=31)
                    textView2.setText("Выраженная симпатикотония");
                if(Double.parseDouble(rezult)>=16&&Double.parseDouble(rezult)<=30)
                    textView2.setText("Симпатикотония");
                if(Double.parseDouble(rezult)>=-15&&Double.parseDouble(rezult)<=15)
                    textView2.setText("Уравновешенность симпатических и парасимпатических влияний");
                if(Double.parseDouble(rezult)<=-16&&Double.parseDouble(rezult)>=-30)
                    textView2.setText("Парасимпатикотония");
                if(Double.parseDouble(rezult)<-30)
                    textView2.setText("Выраженная парасимпатикотония");
                textView3.setText("Индекс Кердо в норме равен 0 усл. ед., что" +
                        "демонстрирует оптимальный уровень вегетативной регуляции сердечно-сосудистой" +
                        "системы, \n"+
                        " - при преобладании симпатического тонуса отмечается" +
                        "увеличение, - при преобладании парасимпатического тонуса отмечается снижение" +
                        "индекса. \n" +
                        " 31 и больше- выраженная симпатикотония\n" +
                        " от +16 до +30 - симпатикотония\n" +
                        " от -15 до +15 - уравновешенность симпатических и" +
                        "парасимпатических влияний\n" +
                        " от -16 до -30 - парасимпатикотония\n" +
                        " -30 и меньше - выраженная парасимпатикотония");
                editor.putString("seven",textView1.getText().toString()+"\n"+textView2.getText().toString());
                break;
            case "8":
                rezult = argument.get("rezult").toString();
                textView1.setText("Ваш результат: "+rezult);
                try {
                    if (Double.parseDouble(rezult) < 2.6)
                        textView2.setText("Функциональные возможности системы кровообращения хорошие");
                    if (Double.parseDouble(rezult) >= 2.6 && Double.parseDouble(rezult) <= 3.09)
                        textView2.setText("Удовлетворительные функциональные возможности системы кровообращения");
                    if (Double.parseDouble(rezult) > 3.09)
                        textView2.setText("Сниженные функциональные возможности системы кровообращения");
                }catch (Exception ignored){}
                textView3.setText("Оценку индекса функциональных изменений (ИФИ) осуществляют по следующей шкале: " +
                        "ИФИ менее 2,6 — функциональные возможности системы кровообращения хорошие. Механизмы адаптации устойчивы: действие неблагоприятных факторов студенческого образа жизни успешно компенсируется мобилизацией внутренних резервов организма, эмпирически подобранными профилактическими мероприятиями (увлечение спортом, рациональное распределение времени на работу и отдых, адекватная организация питания). " +
                        "ИФИ, равный 2,6—3,09 — удовлетворительные функциональные возможности системы кровообращения с умеренным напряжением механизмов регуляции. Эта категория практически здоровых людей, имеющих скрытые или нераспознанные заболевания, нуждающихся в дополнительном обследовании. Скрытые или неясно выраженные нарушения процессов адаптации могут быть восстановлены с помощью методов нелекарственной коррекции (массаж, мышечная релаксация, дыхательная гимнастика, аутотренинг), компенсирующих недостаточность или слабость внутреннего звена саморегуляции функций. " +
                        "ИФИ более 3,09 — сниженные, недостаточные возможности системы кровообращения, наличие выраженных нарушений процессов адаптации. Необходима полноценная диагностика, квалифицированное лечение и индивидуальный подбор профилактических мероприятий в период ремиссии. ");
                textView3.setTextSize(12);
                editor.putString("eight",textView1.getText().toString()+"\n"+textView2.getText().toString());
                break;
        }
        editor.apply();
        btn.setOnClickListener(view -> {
            if(Boolean.valueOf(argument.get("all").toString())&&argument.get("test").toString()!="8")
            {
                Intent intent = new Intent(EndTest.this, Test.class);
                intent.putExtra("test", String.valueOf(Integer.parseInt(argument.get("test").toString())+1));
                intent.putExtra("all", Boolean.valueOf(argument.get("all").toString()));
                if(Integer.parseInt(argument.get("test").toString())+1==8)
                    intent.putExtra("all", false);
                startActivity(intent);
            }
            if(!Boolean.valueOf(argument.get("all").toString()))
            {
                try {
                    Intent intent = new Intent(EndTest.this, Result.class);
                    startActivity(intent);
                }catch (Exception ignored){}
            }
        });
    }
}