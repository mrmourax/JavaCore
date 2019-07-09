public class StringBuilder {
    public static void main(String[] args){
        String name1 = "hello";
        String name2 = " my";
        String name3 = " friend";
        String nameAll = name1+name2+name3;

        //StringBuilder sb = new StringBuilder("Hello");

    }
}

//mutable/umutable
//StringBuilder - mutable
//String - unmutable

//StringBuilder rabotaet bistree, chem konktatenacija, potomu chto pri kontkatenacii kazdij raz sozdaetsa novaja stroka, a v StringBuilder simvoli prosto dobavlajutsa k suwestvujuwemu objektu
//Mutable immutable Java
//hash code - unikalnij nomer
//esli kakaja-to stroka aktivno menjarts na raznie znachenija, to est smisl ispolzovat stringbuilder, inache - prosto string
//Immutable (неизменным) типом в ООП называется такой тип, объект которого после создания становиться неизменным, так сказать read-only. Соответственно mutable(изменчивые) типы готовы к изменениям на всём протяжении своего существования. Immutable тип, например String, не содержит методов для изменения своего состояния. Все методы, которые якобы изменяют состояние объекта String, на самом деле возвращают новые строки

//toString pereopredelenie - nuzen togda, kogda mi xotim k primeru raspe4atat mnogo peremennix v klasse, chtobi ne vizivat kazdij raz gettery, tostato4no prosto raspe4atat object sout(h), do etogo pereopredeliv toString()
//vsegda peremennie klassov delat PRIVATE

//privete - v etom klasse i klasse, kotorij budet nasledivatsa ot etogo
//by default all methods and fields Package-private - dostupen tolko vnutri etogo paketa vo vsex klassax mr
