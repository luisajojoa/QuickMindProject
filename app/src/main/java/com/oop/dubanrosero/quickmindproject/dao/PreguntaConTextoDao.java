package com.oop.dubanrosero.quickmindproject.dao;

import com.oop.dubanrosero.quickmindproject.Util.Constant;
import com.oop.dubanrosero.quickmindproject.models.PreguntaConImagen;
import com.oop.dubanrosero.quickmindproject.models.PreguntaSinImagen;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Luisa Jojoa on 12/11/2016.
 */

public class PreguntaConTextoDao {
    boolean isEnglish;

    public PreguntaConTextoDao(boolean isEnglish) {
        this.isEnglish = isEnglish;
    }

    public List<PreguntaSinImagen> getPreguntasConTextDeporte(){

        List<PreguntaSinImagen> data = new ArrayList<>();

        if (isEnglish){
            String[] options1 = {
                    "Ronaldo","Messi","Maradona","Miroslav Klose"
            };

            //region PREGUNTAS
            PreguntaSinImagen textQuestion1 = new PreguntaSinImagen(
                    "Top scorer in Soccer World Cups:",
                    Constant.TYPE_DEPORTE,
                    options1,
                    "Miroslav Klose"
            );
            data.add(textQuestion1);

            String[] options2 = {
                    "Iker Casillas","Gianluigi Buffon","Oliver Kahn","Gianluigi Donnarumma"
            };

            PreguntaSinImagen textQuestion2 = new PreguntaSinImagen(
                    "Goalkeeper younger to play and win the Champions League final:",
                    Constant.TYPE_DEPORTE,
                    options2,
                    "Iker Casillas"
            );
            data.add(textQuestion2);

            String[] options3 = {
                    "Zinedine Zidane","Ronaldo Nazario","Rivaldo","Miroslav Klose"
            };

            PreguntaSinImagen textQuestion3 = new PreguntaSinImagen(
                    "Goalkeeper of the 2002 FIFA World Cup:",
                    Constant.TYPE_DEPORTE,
                    options3,
                    "Ronaldo Nazario"
            );
            data.add(textQuestion3);

            String[] options4 = {
                    "Vincenzo Nibali","Chris Froome","Nairo Quintana","Alberto Contador"
            };

            PreguntaSinImagen textQuestion4 = new PreguntaSinImagen(
                    "Champion of the 2016 Vuelta a España:",
                    Constant.TYPE_DEPORTE,
                    options4,
                    "Nairo Quintana"
            );
            data.add(textQuestion4);

            String[] options5 = {
                    "Yohan Blake","Usain Bolt","Asafa Powell","Kim Collins"
            };

            PreguntaSinImagen textQuestion5 = new PreguntaSinImagen(
                    "Olympic champion in 100 meters men's in 2012:",
                    Constant.TYPE_DEPORTE,
                    options5,
                    "Usain Bolt"
            );
            data.add(textQuestion5);

            String[] options6 = {
                    "Barcelona","Milan","Real Madrid","Liverpool"
            };

            PreguntaSinImagen textQuestion6 = new PreguntaSinImagen(
                    "Only team to win 5 Champions League consecutively:",
                    Constant.TYPE_DEPORTE,
                    options6,
                    "Real Madrid"
            );
            data.add(textQuestion6);

            String[] options7 = {
                    "Miroslav Klose","Lionel Messi","Neymar","James Rodriguez"
            };

            PreguntaSinImagen textQuestion7 = new PreguntaSinImagen(
                    "Goalkeeper of the 2014 FIFA World Cup:",
                    Constant.TYPE_DEPORTE,
                    options7,
                    "James Rodriguez"
            );
            data.add(textQuestion7);

            String[] options8 = {
                    "Iker Casillas","Cristiano Ronaldo","Sergio Ramos","James Rodriguez"
            };

            PreguntaSinImagen textQuestion8 = new PreguntaSinImagen(
                    "Captain of Real Madrid in 2016: ",
                    Constant.TYPE_DEPORTE,
                    options8,
                    "Sergio Ramos"
            );
            data.add(textQuestion8);

            String[] options9 = {
                    "Carlo Ancelotti","Jurgen Klop","Brendan Rodgers","Pep Guardiola"
            };

            PreguntaSinImagen textQuestion9 = new PreguntaSinImagen(
                    "Liverpool's coach in 2016: ",
                    Constant.TYPE_DEPORTE,
                    options9,
                    "Jurgen Klop"
            );
            data.add(textQuestion9);

            String[] options10 = {
                    "Sergio Aguero","Gonzalo Higuain","Lionel Messi","All of the above"
            };

            PreguntaSinImagen textQuestion10 = new PreguntaSinImagen(
                    "No goal scored in a World Cup final: ",
                    Constant.TYPE_DEPORTE,
                    options10,
                    "All of the above"
            );
            data.add(textQuestion10);

            String[] options11 = {
                    "1903","1989","1997","1909"
            };

            PreguntaSinImagen textQuestion11 = new PreguntaSinImagen(
                    "In what year was Borussia Dortmund founded?",
                    Constant.TYPE_DEPORTE,
                    options11,
                    "1909"
            );
            data.add(textQuestion11);

            String[] options12 = {
                    "La Bombonera","Antonio Vespucio Liberti","Nuñez Stadium","Chamartin Stadium"
            };

            PreguntaSinImagen textQuestion12 = new PreguntaSinImagen(
                    "Which is the name of the river plate stadium?",
                    Constant.TYPE_DEPORTE,
                    options12,
                    "Antonio Vespucio Liberti"
            );
            data.add(textQuestion12);
            //endregion

            //region 401 - 410 Deportes Duban Ingles

            String[] options401 = {
                    "1912","1896","1924","1920"
            };
            PreguntaSinImagen textQuestion401 = new PreguntaSinImagen(
                    "In what year were the first modern Olympic Games?",
                    Constant.TYPE_DEPORTE,
                    options401,
                    "1896"
            );
            data.add(textQuestion401);

            String[] options402 = {
                    "Oscar Gomez","Fabio Tornado","Andres Escobar","Pietro Bastov"
            };
            PreguntaSinImagen textQuestion402 = new PreguntaSinImagen(
                    "What player was killed after scoring a goal in their own door?",
                    Constant.TYPE_DEPORTE,
                    options402,
                    "Andres Escobar"
            );
            data.add(textQuestion402);

            String[] options403 = {
                    "Holland","Spain","Colombia","Brazil"
            };
            PreguntaSinImagen textQuestion403 = new PreguntaSinImagen(
                    "What is the only team that has participated in all World Cups?",
                    Constant.TYPE_DEPORTE,
                    options403,
                    "Brazil"
            );
            data.add(textQuestion403);

            String[] options404 = {
                    "Frog","Swimming","Football","Volleyball"
            };
            PreguntaSinImagen textQuestion404 = new PreguntaSinImagen(
                    "What sport is not an Olympic sport",
                    Constant.TYPE_DEPORTE,
                    options404,
                    "Frog"
            );
            data.add(textQuestion404);

            String[] options405 = {
                    "Falcao","Messi","Yepes","Ronaldo"
            };
            PreguntaSinImagen textQuestion405 = new PreguntaSinImagen(
                    "It was goal of...",
                    Constant.TYPE_DEPORTE,
                    options405,
                    "Yepes"
            );
            data.add(textQuestion405);

            String[] options406 = {
                    "Tower","Pawn","Horse","Bishop"
            };
            PreguntaSinImagen textQuestion406 = new PreguntaSinImagen(
                    "A chess piece that moves in a way the queen can not do",
                    Constant.TYPE_DEPORTE,
                    options406,
                    "Horse"
            );
            data.add(textQuestion406);

            String[] options407 = {
                    "Two","Five","Seven","Nine"
            };
            PreguntaSinImagen textQuestion407 = new PreguntaSinImagen(
                    "How many world titles does the motorcyclist Valentino Rossi have?",
                    Constant.TYPE_DEPORTE,
                    options407,
                    "Nine"
            );
            data.add(textQuestion407);

            String[] options408 = {
                    "54","32","64","81"
            };
            PreguntaSinImagen textQuestion408 = new PreguntaSinImagen(
                    "How many squares does a chess board have?",
                    Constant.TYPE_DEPORTE,
                    options408,
                    "32"
            );
            data.add(textQuestion408);

            String[] options409 = {
                    "15","5","10","8"
            };
            PreguntaSinImagen textQuestion409 = new PreguntaSinImagen(
                    "How many discs does the Rana(Frog) game have?",
                    Constant.TYPE_DEPORTE,
                    options409,
                    "10"
            );
            data.add(textQuestion409);

            String[] options410 = {
                    "Lebron James","Michael Jordan","Bill Russel","Brian Scalabrine"
            };
            PreguntaSinImagen textQuestion410 = new PreguntaSinImagen(
                    "Who won twice three consecutive NBA championships?",
                    Constant.TYPE_DEPORTE,
                    options410,
                    "Michael Jordan"
            );
            data.add(textQuestion410);

            //endregion

            //region PREGUNTA 311
            String[] options311={
                    "Round", "Ring", "Triangle", "Place to fight"
            };
            PreguntaSinImagen textQuestion311= new PreguntaSinImagen(
                    "What's the name of the place surrounded by three ropes where boxers fight?",
                    Constant.TYPE_DEPORTE,
                    options311,
                    "Ring"
            );
            data.add(textQuestion311);
            //endregion

            //region PREGUNTA 312
            String[] options312={
                    "Club Municipal Deportivo","Millonarios","Santa fe","Nacional"
            };
            PreguntaSinImagen textQuestion312= new PreguntaSinImagen(
                    "Who was the first Colombian champion of an international soccer tournament?",
                    Constant.TYPE_DEPORTE,
                    options312,
                    "Club Municipal Deportivo"
            );
            data.add(textQuestion312);
            //endregion

            //region PREGUNTA 313
            String[] options313={
                    "Argentina","Urugay","Spain","Chile"
            };
            PreguntaSinImagen textQuestion313= new PreguntaSinImagen(
                    "Where is the tennis player Juan Martin del Potro?",
                    Constant.TYPE_DEPORTE,
                    options313,
                    "Argentina"
            );
            data.add(textQuestion313);
            //endregion

            //region PREGUNTA 314
            String[] options314={
                    "Monumental José Fierro","Monumental José Ferro","José Fierro","None of above"
            };
            PreguntaSinImagen textQuestion314= new PreguntaSinImagen(
                    "What is said to be the coolest soccer field in Argentina?",
                    Constant.TYPE_DEPORTE,
                    options314,
                    "Monumental José Fierro"
            );
            data.add(textQuestion314);
            //endregion

            //region PREGUNTA 315
            String[] options315={
                    "1946","1945","1960","1961"
            };
            PreguntaSinImagen textQuestion315= new PreguntaSinImagen(
                    "When was the Millonarios sports club founded?",
                    Constant.TYPE_DEPORTE,
                    options315,
                    "1946"
            );
            data.add(textQuestion315);
            //endregion

            //region PREGUNTA 316
            String[] options316={
                    "Independiente Medellin","Nacional","Junior","None of above"
            };
            PreguntaSinImagen textQuestion316= new PreguntaSinImagen(
                    "In which team did Juan Guillermo Cuadrado start his football career?",
                    Constant.TYPE_DEPORTE,
                    options316,
                    "Independiente Medellin"
            );
            data.add(textQuestion316);
            //endregion

            //region PREGUNTA 317
            String[] options317={
                    "Buenaventura","Tumaco","Barranquilla","Nuqui"
            };
            PreguntaSinImagen textQuestion317= new PreguntaSinImagen(
                    "Where was Pablo Armero born?",
                    Constant.TYPE_DEPORTE,
                    options317,
                    "Tumaco"
            );
            data.add(textQuestion317);
            //endregion

            //region PREGUNTA 318
            String[] options318={
                    "None of above","Rondaldo Arantes","Edson Martinez","Edson Arantes do Nascimento"
            };
            PreguntaSinImagen preguntaConTexto318= new PreguntaSinImagen(
                    "What is Pele's real name?",
                    Constant.TYPE_DEPORTE,
                    options318,
                    "Edson Arantes do Nascimento"
            );
            data.add(preguntaConTexto318);
            //endregion

            //region PREGUNTA 319
            String[] optionss319={
                    "Costa Rica, Spain, Germany and the United States", "Netherlands, Argentina, Brazil and Germany", "Germany, Brazil, Argentina and Spain", "None of the above"
            };
            PreguntaSinImagen textQuestion319= new PreguntaSinImagen(
                    "Who happened to the semifinals in the World Cup Brazil 2014?",
                    Constant.TYPE_DEPORTE,
                    optionss319,
                    "Netherlands, Argentina, Brazil and Germany"
            );
            data.add(textQuestion319);
            //endregion


        }

        else {
            String[] opciones1={ "Ronaldo","Messi","Maradona","Miroslav Klose"};
            PreguntaSinImagen preguntaConTexto1= new PreguntaSinImagen(
                    "Máximo goleador en la historia de los mundiales:",
                    Constant.TYPE_DEPORTE,
                    opciones1,
                    "Miroslav Klose"
            );
            data.add(preguntaConTexto1);

            //region 401- 410 Deportes Duban

            String[] opciones401={
                    "1912","1896","1924","1920"
            };
            PreguntaSinImagen preguntaConTexto401= new PreguntaSinImagen(
                    "¿En qué año fueron los primeros Juegos Olimpicos modernos?",
                    Constant.TYPE_DEPORTE,
                    opciones401,
                    "1896"
            );
            data.add(preguntaConTexto401);

            String[] opciones402={
                    "Oscar Gomez","Fabio Tornado","Andres Escobar","Pietro Bastov"
            };
            PreguntaSinImagen preguntaConTexto402= new PreguntaSinImagen(
                    "¿A qué jugador asesinaron tras marcar un gol en su propia puerta?",
                    Constant.TYPE_DEPORTE,
                    opciones402,
                    "Andres Escobar"
            );
            data.add(preguntaConTexto402);

            String[] opciones403={
                    "Holanda","España","Colombia","Brasil"
            };
            PreguntaSinImagen preguntaConTexto403= new PreguntaSinImagen(
                    "¿Cuál es la única selección que ha participado en todos los Mundiales?",
                    Constant.TYPE_DEPORTE,
                    opciones403,
                    "Brasil"
            );
            data.add(preguntaConTexto403);

            String[] opciones404={
                    "Futbol","Atletismo","Natación","Tejo"
            };
            PreguntaSinImagen preguntaConTexto404 = new PreguntaSinImagen(
                    "¿Que deporte no es un deporte olimpico?",
                    Constant.TYPE_DEPORTE,
                    opciones404,
                    "Tejo"
            );
            data.add(preguntaConTexto404);

            String[] opciones405={
                    "Falcao","Messi","Yepes","Ronaldo"
            };
            PreguntaSinImagen preguntaConTexto405 = new PreguntaSinImagen(
                    "Era gol de....",
                    Constant.TYPE_DEPORTE,
                    opciones405,
                    "Yepes"
            );
            data.add(preguntaConTexto405);

            String[] opciones406={
                    "Peón","Torre","Caballo","Alfil"
            };
            PreguntaSinImagen preguntaConTexto406 = new PreguntaSinImagen(
                    "Pieza de ajedrez que se mueve de una forma que no puede hacerlo la reina",
                    Constant.TYPE_DEPORTE,
                    opciones406,
                    "Caballo"
            );
            data.add(preguntaConTexto406);

            String[] opciones407={
                    "Dos","Cinco","Siete","Nueve"
            };
            PreguntaSinImagen preguntaConTexto407 = new PreguntaSinImagen(
                    "¿Cuántos títulos mundiales posee el motociclista Valentino Rossi?",
                    Constant.TYPE_DEPORTE,
                    opciones407,
                    "Nueve"
            );
            data.add(preguntaConTexto407);

            String[] opciones408={
                    "54","32","64","81"
            };
            PreguntaSinImagen preguntaConTexto408 = new PreguntaSinImagen(
                    "¿Cuántos cuadros tiene la mitad de un tablero de ajedrez?",
                    Constant.TYPE_DEPORTE,
                    opciones408,
                    "32"
            );
            data.add(preguntaConTexto408);

            String[] opciones409={
                    "15","5","10","8"
            };
            PreguntaSinImagen preguntaConTexto409 = new PreguntaSinImagen(
                    "¿Cuántos discos de lanzar tiene el juego de Rana",
                    Constant.TYPE_DEPORTE,
                    opciones409,
                    "10"
            );
            data.add(preguntaConTexto409);

            String[] opciones410={
                    "Lebron James","Michael Jordan","Bill Russel","Brian Scalabrine"
            };
            PreguntaSinImagen preguntaConTexto410 = new PreguntaSinImagen(
                    "¿Quién ganó dos veces tres campeonatos consecutivamente en la NBA?",
                    Constant.TYPE_DEPORTE,
                    opciones410,
                    "Michael Jordan"
            );
            data.add(preguntaConTexto410);


            //endregion

            //region PREGUNTA 311
            String[] opciones311={
                    "Round","Ring","Triangulo","Sitio para pelear"
            };
            PreguntaSinImagen preguntaConTexto311= new PreguntaSinImagen(
                    "¿Cómo se llama el lugar rodeado de tres cuerdas donde pelean los boxeadores?",
                    Constant.TYPE_DEPORTE,
                    opciones311,
                    "Ring"
            );
            data.add(preguntaConTexto311);
            //endregion

            //region PREGUNTA 312
            String[] opciones312={
                    "Club Municipal Deportivo","Millonarios","Sanatfe","Nacional"
            };
            PreguntaSinImagen preguntaConTexto312= new PreguntaSinImagen(
                    "¿Cuál fue el primer campeón Colombian de un torneo internacional de Futbol?",
                    Constant.TYPE_DEPORTE,
                    opciones312,
                    "Club Municipal Deportivo"
            );
            data.add(preguntaConTexto312);
            //endregion

            //region PREGUNTA 313
            String[] opciones313={
                    "Argentina","Urugay","España","Chile"
            };
            PreguntaSinImagen preguntaConTexto313= new PreguntaSinImagen(
                    "¿De dónde es el tenista Juan Martín del Potro?",
                    Constant.TYPE_DEPORTE,
                    opciones313,
                    "Argentina"
            );
            data.add(preguntaConTexto313);
            //endregion

            //region PREGUNTA 314
            String[] opciones314={
                    "Monumental José Fierro","Monumental José Ferro","José Fierro","Ninguna de las anteriores"
            };
            PreguntaSinImagen preguntaConTexto314= new PreguntaSinImagen(
                    "¿Cuál se dice que es la cancha más fría del fútbol argentino?",
                    Constant.TYPE_DEPORTE,
                    opciones314,
                    "Monumental José Fierro"
            );
            data.add(preguntaConTexto314);
            //endregion

            //region PREGUNTA 315
            String[] opciones315={
                    "1946","1945","1960","1961"
            };
            PreguntaSinImagen preguntaConTexto315= new PreguntaSinImagen(
                    "¿Cuándo se fundó el club deportivo Millonarios?",
                    Constant.TYPE_DEPORTE,
                    opciones315,
                    "1946"
            );
            data.add(preguntaConTexto315);
            //endregion

            //region PREGUNTA 316
            String[] opciones316={
                    "Independiente Medellin","Nacional","Junior","Ninguna de las anteriores"
            };
            PreguntaSinImagen preguntaConTexto316= new PreguntaSinImagen(
                    "¿En qué equipo comenzó Juan Guillermo Cuadrado su carrera futbolística?",
                    Constant.TYPE_DEPORTE,
                    opciones316,
                    "Independiente Medellin"
            );
            data.add(preguntaConTexto316);
            //endregion

            //region PREGUNTA 317
            String[] opciones317={
                    "Buenaventura","Tumaco","Barranquilla","Nuqui"
            };
            PreguntaSinImagen preguntaConTexto317= new PreguntaSinImagen(
                    "¿Dónde nació Pablo Armero?",
                    Constant.TYPE_DEPORTE,
                    opciones317,
                    "Tumaco"
            );
            data.add(preguntaConTexto317);
            //endregion

            //region PREGUNTA 318
            String[] opciones318={
                    "Ninguna de las anteriores","Rondaldo Arantes","Edson Martinez","Edson Arantes do Nascimento"
            };
            PreguntaSinImagen preguntaConTexto318= new PreguntaSinImagen(
                    "¿Cuál es el nombre real de Pelé?",
                    Constant.TYPE_DEPORTE,
                    opciones318,
                    "Edson Arantes do Nascimento"
            );
            data.add(preguntaConTexto318);
            //endregion

            //region PREGUNTA 319
            String[] opciones319={
                    "Costa Rica, España, Alemania y Estados Unidos","Holanda, Argentina, Brasil y Alemania", "Alemania, Brasil, Argentina y España","Ninguna de las anteriores"
            };
            PreguntaSinImagen preguntaConTexto319= new PreguntaSinImagen(
                    "¿Quién pasó a seminifales en el mundial Brasil 2014?",
                    Constant.TYPE_DEPORTE,
                    opciones319,
                    "Holanda, Argentina, Brasil y Alemania"
            );
            data.add(preguntaConTexto319);
            //endregion

            //region PREGUNTAS
            String[] opciones2 = {
                    "Iker Casillas","Gianluigi Buffon","Oliver Kahn","Gianluigi Donnarumma"
            };

            PreguntaSinImagen preguntaConTexto2 = new PreguntaSinImagen(
                    "Portero más joven en jugar y ganar la final de la Champions:",
                    Constant.TYPE_DEPORTE,
                    opciones2,
                    "Iker Casillas"
            );
            data.add(preguntaConTexto2);

            String[] opciones3 = {
                    "Zinedine Zidane","Ronaldo Nazario","Rivaldo","Miroslav Klose"
            };

            PreguntaSinImagen preguntaConTexto3 = new PreguntaSinImagen(
                    "Goleador del mundial de fútbol de 2002: ",
                    Constant.TYPE_DEPORTE,
                    opciones3,
                    "Ronaldo Nazario"
            );
            data.add(preguntaConTexto3);

            String[] opciones4 = {
                    "Vincenzo Nibali","Chris Froome","Nairo Quintana","Alberto Contador"
            };

            PreguntaSinImagen preguntaConTexto4 = new PreguntaSinImagen(
                    "Campeón de la vuelta a España 2016: ",
                    Constant.TYPE_DEPORTE,
                    opciones4,
                    "Nairo Quintana"
            );
            data.add(preguntaConTexto4);

            String[] opciones5 = {
                    "Yohan Blake","Usain Bolt","Asafa Powell","Kim Collins"
            };

            PreguntaSinImagen preguntaConTexto5 = new PreguntaSinImagen(
                    "Campeón olímpico en los 100 metros planos en 2012:",
                    Constant.TYPE_DEPORTE,
                    opciones5,
                    "Usain Bolt"
            );
            data.add(preguntaConTexto5);

            String[] opciones6 = {
                    "Barcelona","Milán","Real Madrid","Liverpool"
            };

            PreguntaSinImagen preguntaConTexto6 = new PreguntaSinImagen(
                    "Único equipo en ganar 5 Champions de forma consecutiva:",
                    Constant.TYPE_DEPORTE,
                    opciones6,
                    "Real Madrid"
            );
            data.add(preguntaConTexto6);

            String[] opciones7 = {
                    "Miroslav Klose","Lionel Messi","Neymar","James Rodriguez"
            };

            PreguntaSinImagen preguntaConTexto7 = new PreguntaSinImagen(
                    "Goleador del mundial de fútbol de 2014:",
                    Constant.TYPE_DEPORTE,
                    opciones7,
                    "James Rodriguez"
            );
            data.add(preguntaConTexto7);

            String[] opciones8 = {
                    "Iker Casillas","Cristiano Ronaldo","Sergio Ramos","James Rodriguez"
            };

            PreguntaSinImagen preguntaConTexto8 = new PreguntaSinImagen(
                    "Capitán del Real Madrid en 2016:",
                    Constant.TYPE_DEPORTE,
                    opciones8,
                    "Sergio Ramos"
            );
            data.add(preguntaConTexto8);

            String[] opciones9 = {
                    "Carlo Ancelotti","Jurgen Klop","Brendan Rodgers","Pep Guardiola"
            };

            PreguntaSinImagen preguntaConTexto9 = new PreguntaSinImagen(
                    "Técnico del Liverpool en 2016:",
                    Constant.TYPE_DEPORTE,
                    opciones9,
                    "Jurgen Klop"
            );
            data.add(preguntaConTexto9);

            String[] opciones10 = {
                    "Sergio Aguero","Gonzalo Higuain","Lionel Messi","Todos los anteriores"
            };

            PreguntaSinImagen preguntaConTexto10 = new PreguntaSinImagen(
                    "No anotó gol en una final de un mundial:",
                    Constant.TYPE_DEPORTE,
                    opciones10,
                    "Todos los anteriores"
            );
            data.add(preguntaConTexto10);

            String[] opciones11 = {
                    "1903","1989","19997","1909"
            };

            PreguntaSinImagen preguntaConTexto11 = new PreguntaSinImagen(
                    "¿En que año se fundo el Borussia Dortmund?",
                    Constant.TYPE_DEPORTE,
                    opciones11,
                    "1909"
            );
            data.add(preguntaConTexto11);

            String[] opciones12 = {
                    "La Bombonera","Antonio Vespucio Liberti","Estadio de Nuñez","Chamartin"
            };

            PreguntaSinImagen preguntaConTexto12 = new PreguntaSinImagen(
                    "¿Cómo se llama el estadio de River Plate?",
                    Constant.TYPE_DEPORTE,
                    opciones12,
                    "Antonio Vespucio Liberti"
            );
            data.add(preguntaConTexto12);

            //endregion
        }
        return data;
    }

    public List<PreguntaSinImagen> getPreguntasConTextCiencia(){

        List<PreguntaSinImagen> data = new ArrayList<>();

        if (isEnglish){

            //region PREGUNTAS
            String[] options1 = {
                    "Mitosis","Meiosis","Cytokinesis","karyiokinesis"
            };

            PreguntaSinImagen textQuestion1 = new PreguntaSinImagen(
                    "Process by wich the cell divides itself into two daughter cells?",
                    Constant.TYPE_CIENCIAS,
                    options1,
                    "Mitosis"
            );

            data.add(textQuestion1);

            String[] options2 = {
                    "Theory of general relativity","Theory of special relativity","Law of photoelectric effect","Law of universal gravitation"
            };

            PreguntaSinImagen textQuestion2 = new PreguntaSinImagen(
                    "Albert Einstein won the Nobel Prize in physics in 1921 for:",
                    Constant.TYPE_CIENCIAS,
                    options2,
                    "Law of photoelectric effect"
            );

            data.add(textQuestion2);

            String[] options3 = {
                    "Peter Grünberg","Peter Higgs","Isaac Newton","John M. Kosterlitz"
            };

            PreguntaSinImagen textQuestion3 = new PreguntaSinImagen(
                    "Winner of the Nobel Prize in Physics in 2013:",
                    Constant.TYPE_CIENCIAS,
                    options3,
                    "Peter Higgs"
            );

            data.add(textQuestion3);

            String[] options4 = {
                    "Hipparchia","Theano","Aspasia","Hipatia"
            };

            PreguntaSinImagen textQuestion4= new PreguntaSinImagen(
                    "Greek mathematician wife of Pythagoras:",
                    Constant.TYPE_CIENCIAS,
                    options4,
                    "Theano"
            );

            data.add(textQuestion4);

            String[] options5 = {
                    "Silicon","Germanium","Carbon","Gallium"
            };

            PreguntaSinImagen textQuestion5= new PreguntaSinImagen(
                    "It's not a semiconductor:",
                    Constant.TYPE_CIENCIAS,
                    options5,
                    "Carbon"
            );

            data.add(textQuestion5);

            String[] options6 = {
                    "Aristoteles","Leibniz","Pitagoras","Descartes"
            };

            PreguntaSinImagen textQuestion6= new PreguntaSinImagen(
                    "Contributed to the creation of the calculus:",
                    Constant.TYPE_CIENCIAS,
                    options6,
                    "Leibniz"
            );

            data.add(textQuestion6);

            String[] options7 = {
                    "Nicolaus Copernicus","Galileo Galilei","Isaac Newton","Johannes Kepler"
            };

            PreguntaSinImagen textQuestion7= new PreguntaSinImagen(
                    "First astronomer to observe the rings of Saturn:",
                    Constant.TYPE_CIENCIAS,
                    options7,
                    "Galileo Galilei"
            );

            data.add(textQuestion7);

            String[] options8 = {
                    "Michael Faraday","Alfred Nobel","Nikola Tesla","Dmitri Mendeléyev"
            };

            PreguntaSinImagen textQuestion8= new PreguntaSinImagen(
                    "First person to put an order for the chemical elements:",
                    Constant.TYPE_CIENCIAS,
                    options8,
                    "Dmitri Mendeléyev"
            );

            data.add(textQuestion8);

            String[] options9 = {
                    "1","425","233","10"
            };

            PreguntaSinImagen textQuestion9= new PreguntaSinImagen(
                    "4x9x32x1x0+10",
                    Constant.TYPE_CIENCIAS,
                    options9,
                    "10"
            );

            data.add(textQuestion9);
            String[] options10 = {
                    "KCl","CH4","NaCl","H20"
            };

            PreguntaSinImagen textQuestion10= new PreguntaSinImagen(
                    "Salt",
                    Constant.TYPE_CIENCIAS,
                    options10,
                    "NaCl"
            );

            data.add(textQuestion10);

            data.add(textQuestion9);
            String[] options11 = {
                    "Armstrong","Collins","Aldrin","Laika"
            };

            PreguntaSinImagen textQuestion11= new PreguntaSinImagen(
                    "First living being to orbit the Earth",
                    Constant.TYPE_CIENCIAS,
                    options11,
                    "Laika"
            );

            data.add(textQuestion11);

            String[] options12 = {
                    "Elkin Patarroyo","Rodolfo Llinas","Salomon Hakim","Jorge Reynolds Pombo"
            };

            PreguntaSinImagen textQuestion12= new PreguntaSinImagen(
                    "Inventor of the pacemaker:",
                    Constant.TYPE_CIENCIAS,
                    options12,
                    "Jorge Reynolds Pombo"
            );

            data.add(textQuestion12);

            //endregion

            //region 421- 430 Ingles Ciencias Duban

            String[] ooptions421 = {
                    "Does not exist","Is live","Is live and Dead","Is dead"
            };
            PreguntaSinImagen textQuestion421 = new PreguntaSinImagen(
                    "What happen with Schrodinger cat?",
                    Constant.TYPE_CIENCIAS,
                    ooptions421,
                    "Is live and dead"
            );
            data.add(textQuestion421);

            String[] ooptions422 = {
                    "Does not exist","It is created","It is destroyed","It transforms"
            };
            PreguntaSinImagen textQuestion422 = new PreguntaSinImagen(
                    "What happens to energy?",
                    Constant.TYPE_CIENCIAS,
                    ooptions422,
                    "It transforms"
            );
            data.add(textQuestion422);

            String[] ooptions423 = {
                    "A bullet train","A supersonic aircraft","A country","An extinct animal"
            };
            PreguntaSinImagen textQuestion423 = new PreguntaSinImagen(
                    "What was the Concorde?",
                    Constant.TYPE_CIENCIAS,
                    ooptions423,
                    "A supersonic aircraft"
            );
            data.add(textQuestion423);

            String[] ooptions424 = {
                    "Nuclear fision","Nuclear fusion","Rotation","Energy"
            };
            PreguntaSinImagen textQuestion424 = new PreguntaSinImagen(
                    "Process by which the sun releases energy",
                    Constant.TYPE_CIENCIAS,
                    ooptions424,
                    "Nuclear fusion"
            );
            data.add(textQuestion424);

            String[] ooptions425 = {
                    "Blood clotting ","Combat diseases","Take Oxygen","Take water"
            };
            PreguntaSinImagen textQuestion425 = new PreguntaSinImagen(
                    "Process by which the sun releases energy",
                    Constant.TYPE_CIENCIAS,
                    ooptions425,
                    "Combat diseases"
            );
            data.add(textQuestion425);

            String[] ooptions426 = {
                    "Aphelion","Perigee","Apogee","Perihelion"
            };
            PreguntaSinImagen textQuestion426 = new PreguntaSinImagen(
                    "What is the name of the point of the ecliptic closest to the sun?",
                    Constant.TYPE_CIENCIAS,
                    ooptions426,
                    "Perihelion"
            );
            data.add(textQuestion426);

            String[] ooptions427 = {
                    "Infinity","Does not exist","One","Zero"
            };
            PreguntaSinImagen textQuestion427= new PreguntaSinImagen(
                    "What is the limit of a finite quantity divided by another that tends to zero?",
                    Constant.TYPE_CIENCIAS,
                    ooptions427,
                    "Infinity"
            );
            data.add(textQuestion427);

            String[] ooptions428 = {
                    "343","145","1234.8","248"
            };
            PreguntaSinImagen textQuestion428= new PreguntaSinImagen(
                    "What is the speed of sound in the air?(m/s)",
                    Constant.TYPE_CIENCIAS,
                    ooptions428,
                    "343"
            );
            data.add(textQuestion428);

            String[] ooptions429 = {
                    "132","8","4","17"
            };
            PreguntaSinImagen textQuestion429= new PreguntaSinImagen(
                    "Atomic number of oxygen",
                    Constant.TYPE_CIENCIAS,
                    ooptions429,
                    "8"
            );
            data.add(textQuestion429);

            String[] ooptions430 = {
                    "Sirio","Canopus","Altair","Vega"
            };
            PreguntaSinImagen textQuestion430= new PreguntaSinImagen(
                    "What is the brightest star in the whole night sky?",
                    Constant.TYPE_CIENCIAS,
                    ooptions430,
                    "Sirio"
            );
            data.add(textQuestion430);

            //endregion

            //region PREGUNTA 320
            String[] options320= {
                    "Mule","Mare","Filly","Donkey"
            };

            PreguntaSinImagen textQuestion320= new PreguntaSinImagen(
                    "What is the descendant called between an ass and a mare?",
                    Constant.TYPE_CIENCIAS,
                    options320,
                    "Mule"
            );
            data.add(textQuestion320);
            //endregion

            //region PREGUNTA 321
            String[] options321= {
                    "Cartesian north pole","Antarctic","Antarctica","Polaris"
            };

            PreguntaSinImagen textQuestion321= new PreguntaSinImagen(
                    "What coincides with the celestial north pole?",
                    Constant.TYPE_CIENCIAS,
                    options321,
                    "Polaris"
            );
            data.add(textQuestion321);
            //endregion

            //region PREGUNTA 322
            String[] options322= {
                    "Vegetable","Vegetal","Green","Fruit"
            };

            PreguntaSinImagen textQuestion322= new PreguntaSinImagen(
                    "For botanists, what is a tomato?",
                    Constant.TYPE_CIENCIAS,
                    options322,
                    "Fruit"
            );
            data.add(textQuestion322);
            //endregion

            //region PREGUNTA 323
            String[] opciones323= {
                    "Magnetic attraction","Electric current","Light emission","All of the above"
            };

            PreguntaSinImagen preguntaConTexto323= new PreguntaSinImagen(
                    "What causes the variation of a magnetic field?",
                    Constant.TYPE_CIENCIAS,
                    opciones323,
                    "Electric current"
            );
            data.add(preguntaConTexto323);
            //endregion

            //region PREGUNTA 324
            String[] options324= {
                    "Penicillin", "Atomic bomb", "Dynamite", "The idea of creating the awards"
            };

            PreguntaSinImagen textQuestion324= new PreguntaSinImagen(
                    "What invented Alfred Nobel, who names the famous prizes?",
                    Constant.TYPE_CIENCIAS,
                    options324,
                    "Dynamite"
            );
            data.add(textQuestion324);
            //endregion

            //region PREGUNTA 325
            String[] options325= {
                    "Flying Squirrel", "Bat", "None of the above", "Flying Cat"
            };

            PreguntaSinImagen textQuestion325= new PreguntaSinImagen(
                    "What is the only mammal capable of flying?",
                    Constant.TYPE_CIENCIAS,
                    options325,
                    "Bat"
            );
            data.add(textQuestion325);
            //endregion

            //region PREGUNTA 326
            String[] options326= {
                    "205","310","280","206"
            };

            PreguntaSinImagen textQuestion326= new PreguntaSinImagen(
                    "How many bones does an adult human have?",
                    Constant.TYPE_CIENCIAS,
                    options326,
                    "206"
            );
            data.add(textQuestion326);
            //endregion

            //region PREGUNTA 327
            String[] opciones327= {
                    "100","1500","1000","800"
            };

            PreguntaSinImagen preguntaConTexto327= new PreguntaSinImagen(
                    "How many earthquakes does Japan feel average per year?",
                    Constant.TYPE_CIENCIAS,
                    opciones327,
                    "1500"
            );
            data.add(preguntaConTexto327);
            //endregion

            //region PREGUNTA 328
            String[] opciones328= {
                    "36m","20m","10m","15m"
            };

            PreguntaSinImagen preguntaConTexto328= new PreguntaSinImagen(
                    "How much hair does an average person produce each year?",
                    Constant.TYPE_CIENCIAS,
                    opciones328,
                    "36m"
            );
            data.add(preguntaConTexto328);
            //endregion

            //region PREGUNTA 329
            String[] opciones329= {
                    "1943","1953","1869","1890"
            };

            PreguntaSinImagen preguntaConTexto329= new PreguntaSinImagen(
                    "When is the molecular structure of DNA established for the first time?",
                    Constant.TYPE_CIENCIAS,
                    opciones329,
                    "1953"
            );
            data.add(preguntaConTexto329);
            //endregion


        }

        else {
            String[] opciones1= {
              "Mitosis","Meiosis","Citocinesis","Cariocinesis"
            };

            PreguntaSinImagen preguntaConTexto1= new PreguntaSinImagen(
                    "¿Cuál es el proceso mediante el cual la célula se divide en dos células hijas?",
                    Constant.TYPE_CIENCIAS,
                    opciones1,
                    "Mitosis"
            );
            data.add(preguntaConTexto1);

            //region 421- 430 Ciencia Duban


            String[] opciones421= {
                    "Está vivo","No extiste","Está muerto","Esta vivo y muerto"
            };
            PreguntaSinImagen preguntaConTexto421= new PreguntaSinImagen(
                    "¿Qué le pasa en realidad al gato de Schrödinger?",
                    Constant.TYPE_CIENCIAS,
                    opciones421,
                    "Esta vivo y muerto"
            );
            data.add(preguntaConTexto421);

            String[] opciones422= {
                    "Se transforma","Se crea","Se destruye","Se consume"
            };
            PreguntaSinImagen preguntaConTexto422= new PreguntaSinImagen(
                    "¿Qué le sucede a la energía?",
                    Constant.TYPE_CIENCIAS,
                    opciones422,
                    "Se transforma"
            );
            data.add(preguntaConTexto422);

            String[] opciones423= {
                    "Un pais","Un tren bala","Un avión supersónico","Una animal extinto"
            };
            PreguntaSinImagen preguntaConTexto423= new PreguntaSinImagen(
                    "¿Que era el Concorde?",
                    Constant.TYPE_CIENCIAS,
                    opciones423,
                    "Un avión supersónico"
            );
            data.add(preguntaConTexto423);

            String[] opciones424={
                    "Fisión Nuclear","Fusión Nuclear","Rotación","Energía"
            };
            PreguntaSinImagen preguntaConTexto424=new PreguntaSinImagen(
                    "Proceso por el cual el sol libera energía",
                    Constant.TYPE_CIENCIAS,
                    opciones424,
                    "Fusión Nuclear"
            );
            data.add(preguntaConTexto424);

            String[] opciones425={
                    "Coagular sangre","Combatir enfermedades","Llevar Oxigeno","Cargar agua"
            };
            PreguntaSinImagen preguntaConTexto425=new PreguntaSinImagen(
                    "¿Cuál es la principal función de lo globulos blancos?",
                    Constant.TYPE_CIENCIAS,
                    opciones425,
                    "Combatir enfermedades"
            );
            data.add(preguntaConTexto425);

            String[] opciones426={
                    "Afelio","Perigeo","Apogeo","Perihelio"
            };
            PreguntaSinImagen preguntaConTexto426=new PreguntaSinImagen(
                    "¿Cuál es el nombre del punto de la eclíptica más cercana al sol?",
                    Constant.TYPE_CIENCIAS,
                    opciones426,
                    "Perihelio"
            );
            data.add(preguntaConTexto426);

            String[] opciones427={
                    "Infinito","No existe","Uno","Cero"
            };
            PreguntaSinImagen preguntaConTexto427=new PreguntaSinImagen(
                    "¿Cuál es el limite de una cantidad finita dividida por otra que tiende a cero?",
                    Constant.TYPE_CIENCIAS,
                    opciones427,
                    "Infinito"
            );
            data.add(preguntaConTexto427);

            String[] opciones428={
                    "343","145","1234.8","248"
            };
            PreguntaSinImagen preguntaConTexto428=new PreguntaSinImagen(
                    "¿Cuál es la velocidad del sonido en el aire? (m/s)",
                    Constant.TYPE_CIENCIAS,
                    opciones428,
                    "343"
            );
            data.add(preguntaConTexto428);

            String[] opciones429={
                    "132","8","4","17"
            };
            PreguntaSinImagen preguntaConTexto429=new PreguntaSinImagen(
                    "Número atómico del Oxigeno ",
                    Constant.TYPE_CIENCIAS,
                    opciones429,
                    "8"
            );
            data.add(preguntaConTexto429);

            String[] opciones430={
                    "Sirio","Canopus","Altair","Vega"
            };
            PreguntaSinImagen preguntaConTexto430=new PreguntaSinImagen(
                    "¿Cuál es la estrella más brillante de todo el cielo nocturno?",
                    Constant.TYPE_CIENCIAS,
                    opciones430,
                    "Sirio"
            );
            data.add(preguntaConTexto430);

            //endregion

            //region PREGUNTA 320
            String[] opciones320= {
                    "Mula","Yegua","Potranca","Burro"
            };

            PreguntaSinImagen preguntaConTexto320= new PreguntaSinImagen(
                    "¿Cómo se le llama al descentiente entre un asno y una yegua?",
                    Constant.TYPE_CIENCIAS,
                    opciones320,
                    "Mula"
            );
            data.add(preguntaConTexto320);
            //endregion

            //region PREGUNTA 321
            String[] opciones321= {
                    "Polo norte cartesiano","Antártida","Antártica","Polaris"
            };

            PreguntaSinImagen preguntaConTexto321= new PreguntaSinImagen(
                    "¿Con qué coincide el polo norte celeste?",
                    Constant.TYPE_CIENCIAS,
                    opciones321,
                    "Polaris"
            );
            data.add(preguntaConTexto321);
            //endregion

            //region PREGUNTA 322
            String[] opciones322= {
                    "Hortaliza","Vegetal","Verdura","Fruta"
            };

            PreguntaSinImagen preguntaConTexto322= new PreguntaSinImagen(
                    "¿Para los botánicos, qué es un tomate?",
                    Constant.TYPE_CIENCIAS,
                    opciones322,
                    "Fruta"
            );
            data.add(preguntaConTexto322);
            //endregion

            //region PREGUNTA 323
            String[] opciones323= {
                    "Atraccion magnética","Corriente eléctrica","Emisión de Luz","Todas las anteriores"
            };

            PreguntaSinImagen preguntaConTexto323= new PreguntaSinImagen(
                    "¿Qué produce la variación de un campo magnético?",
                    Constant.TYPE_CIENCIAS,
                    opciones323,
                    "Corriente eléctrica"
            );
            data.add(preguntaConTexto323);
            //endregion

            //region PREGUNTA 324
            String[] opciones324= {
                    "Penicilina","Bomba atómica","Dinamita","La idea de crear los premios"
            };

            PreguntaSinImagen preguntaConTexto324= new PreguntaSinImagen(
                    "¿Qué inventó Alfred Nobel, el que da nombrea losfamosos premios?",
                    Constant.TYPE_CIENCIAS,
                    opciones324,
                    "Dinamita"
            );
            data.add(preguntaConTexto324);
            //endregion

            //region PREGUNTA 325
            String[] opciones325= {
                    "Ardilla voladora","Murciélago","Ninguna de las anteriores","Gato volador"
            };

            PreguntaSinImagen preguntaConTexto325= new PreguntaSinImagen(
                    "¿Cuál es el único mamífero capaz de volar?",
                    Constant.TYPE_CIENCIAS,
                    opciones325,
                    "Murciélago"
            );
            data.add(preguntaConTexto325);
            //endregion

            //region PREGUNTA 326
            String[] opciones326= {
                    "205","310","280","206"
            };

            PreguntaSinImagen preguntaConTexto326= new PreguntaSinImagen(
                    "¿Cuántos huesos tiene en total un ser humano adulto?",
                    Constant.TYPE_CIENCIAS,
                    opciones326,
                    "206"
            );
            data.add(preguntaConTexto326);
            //endregion

            //region PREGUNTA 327
            String[] opciones327= {
                    "100","1500","1000","800"
            };

            PreguntaSinImagen preguntaConTexto327= new PreguntaSinImagen(
                    "¿Cuántos terremotos en promedio tiene Japón al año?",
                    Constant.TYPE_CIENCIAS,
                    opciones327,
                    "1500"
            );
            data.add(preguntaConTexto327);
            //endregion

            //region PREGUNTA 328
            String[] opciones328= {
                    "36m","20m","10m","15m"
            };

            PreguntaSinImagen preguntaConTexto328= new PreguntaSinImagen(
                    "¿Cuánto cabello produce en promedio una persona al año?",
                    Constant.TYPE_CIENCIAS,
                    opciones328,
                    "36m"
            );
            data.add(preguntaConTexto328);
            //endregion

            //region PREGUNTA 329
            String[] opciones329= {
                    "1943","1953","1869","1890"
            };

            PreguntaSinImagen preguntaConTexto329= new PreguntaSinImagen(
                    "¿Cuándofue establecida por primera vez la estructura molecular de ADN?",
                    Constant.TYPE_CIENCIAS,
                    opciones329,
                    "1953"
            );
            data.add(preguntaConTexto329);
            //endregion

            //region PREGUNTAS
            String[] opciones2 = {
                    "Teoria de la relatividad general","Teoria de la relatividad especial","Ley de efecto fotoeléctrico","Ley de gravitación universal"
            };

            PreguntaSinImagen peguntaConTexto2 = new PreguntaSinImagen(
                    "Albert Einstein ganó el premio Nobel de física en 1921 por:",
                    Constant.TYPE_CIENCIAS,
                    opciones2,
                    "Ley de efecto fotoeléctrico"
            );

            data.add(peguntaConTexto2);

            String[] opciones3 = {
                    "Peter Grünberg","Peter Higgs","Isaac Newton","John M. Kosterlitz"
            };

            PreguntaSinImagen peguntaConTexto3 = new PreguntaSinImagen(
                    "Ganador del premio Nobel de física en 2013:",
                    Constant.TYPE_CIENCIAS,
                    opciones3,
                    "Peter Higgs"
            );

            data.add(peguntaConTexto3);

            String[] opciones4 = {
                    "Hiparquia","Teano","Aspasia","Hipatia"
            };

            PreguntaSinImagen peguntaConTexto4= new PreguntaSinImagen(
                    "Matemática griega esposa de pitagoras:",
                    Constant.TYPE_CIENCIAS,
                    opciones4,
                    "Teano"
            );

            data.add(peguntaConTexto4);

            String[] opciones5 = {
                    "Silicio","Germanio","Carbono","Galio"
            };

            PreguntaSinImagen peguntaConTexto5= new PreguntaSinImagen(
                    "No es un semiconductor:",
                    Constant.TYPE_CIENCIAS,
                    opciones5,
                    "Carbono"
            );

            data.add(peguntaConTexto5);

            String[] opciones6 = {
                    "Aristoteles","Leibniz","Pitagoras","Descartes"
            };

            PreguntaSinImagen peguntaConTexto6= new PreguntaSinImagen(
                    "Aportó a la creación del cálculo:",
                    Constant.TYPE_CIENCIAS,
                    opciones6,
                    "Leibniz"
            );

            data.add(peguntaConTexto6);

            String[] opciones7 = {
                    "Nicolas Copernico","Galileo Galilei","Isaac Newton","Johannes Kepler"
            };

            PreguntaSinImagen peguntaConTexto7= new PreguntaSinImagen(
                    "Primer astronomo en observar los anillos de saturno:",
                    Constant.TYPE_CIENCIAS,
                    opciones7,
                    "Galileo Galilei"
            );

            data.add(peguntaConTexto7);

            String[] opciones8 = {
                    "Michael Faraday","Alfred Nobel","Nikola Tesla","Dmitri Mendeléyev"
            };

            PreguntaSinImagen peguntaConTexto8= new PreguntaSinImagen(
                    "Primera persona en ordenar los elementos químicos:",
                    Constant.TYPE_CIENCIAS,
                    opciones8,
                    "Dmitri Mendeléyev"
            );

            data.add(peguntaConTexto8);

            String[] opciones9 = {
                    "1","425","233","10"
            };

            PreguntaSinImagen peguntaConTexto9= new PreguntaSinImagen(
                    "4x9x32x1x0+10",
                    Constant.TYPE_CIENCIAS,
                    opciones9,
                    "10"
            );

            data.add(peguntaConTexto9);
            String[] opciones10 = {
                    "KCl","CH4","NaCl","H20"
            };

            PreguntaSinImagen peguntaConTexto10= new PreguntaSinImagen(
                    "Sal de cocina:",
                    Constant.TYPE_CIENCIAS,
                    opciones10,
                    "NaCl"
            );

            data.add(peguntaConTexto10);


            String[] opciones11 = {
                    "Armstrong","Collins","Aldrin","Laika"
            };

            PreguntaSinImagen peguntaConTexto11= new PreguntaSinImagen(
                    "Primer ser vivo en orbitar la tierra:",
                    Constant.TYPE_CIENCIAS,
                    opciones11,
                    "Laika"
            );

            data.add(peguntaConTexto11);

            String[] opciones12 = {
                    "Elkin Patarroyo","Rodolfo Llinás","Salomón Hakim","Jorge Reynolds Pombo"
            };

            PreguntaSinImagen peguntaConTexto12= new PreguntaSinImagen(
                    "Inventor del marcapasos:",
                    Constant.TYPE_CIENCIAS,
                    opciones12,
                    "Jorge Reynolds Pombo"
            );

            data.add(peguntaConTexto12);
            //endregion


        }
        return data;
    }
    public List<PreguntaSinImagen> getPreguntasConTextSociales(){

        List<PreguntaSinImagen> data = new ArrayList<>();

        if (isEnglish){

            //region PREGUNTAS
            String[] options1 = {
                    "Moscow","Bogota","Turin","Athens"
            };

            PreguntaSinImagen textQuestion1 = new PreguntaSinImagen(
                    "What is the colombian capital?",
                    Constant.TYPE_SOCIALES,
                    options1,
                    "Bogota"
            );
            data.add(textQuestion1);

            String[] options2 = {
                    "La paz","Sucre","Punata","Medellin"
            };

            PreguntaSinImagen textQuestion2 = new PreguntaSinImagen(
                    "What's Bolivia's Capital?",
                    Constant.TYPE_SOCIALES,
                    options2,
                    "Sucre"
            );
            data.add(textQuestion2);

            String[] options3 = {
                    "March 30, 1958","April 9, 1949","April 9, 1948","September 19, 1947"
            };

            PreguntaSinImagen textQuestion3 = new PreguntaSinImagen(
                    "What day was the murder of Jorge Eliecer Gaitan?",
                    Constant.TYPE_SOCIALES,
                    options3,
                    "April 9, 1948"
            );
            data.add(textQuestion3);

            String[] options4 = {
                    "Freedom, Respect, Peace","Freedom, Respect, Love","Freedom, Peace, Love","Freedom, Equality, Fraternity"
            };

            PreguntaSinImagen textQuestion4 = new PreguntaSinImagen(
                    "The principles of french revolution was:",
                    Constant.TYPE_SOCIALES,
                    options4,
                    "Freedom, Equality, Fraternity"
            );
            data.add(textQuestion4);

            String[] options5 = {
                    "Barbados","Andorra","Monaco","Liechtenstein"
            };

            PreguntaSinImagen textQuestion5 = new PreguntaSinImagen(
                    "It's not a european microstate",
                    Constant.TYPE_SOCIALES,
                    options5,
                    "Barbados"
            );
            data.add(textQuestion5);

            String[] options6 = {
                    "Ares","Thor","Ull","Tyr"
            };

            PreguntaSinImagen textQuestion6 = new PreguntaSinImagen(
                    "Nordic god of war:",
                    Constant.TYPE_SOCIALES,
                    options6,
                    "Tyr"
            );
            data.add(textQuestion6);

            String[] options7 = {
                    "France","United Kingdom","Spain","Germany"
            };

            PreguntaSinImagen textQuestion7 = new PreguntaSinImagen(
                    "Where did Napoleon die?",
                    Constant.TYPE_SOCIALES,
                    options7,
                    "United Kingdom"
            );
            data.add(textQuestion7);

            String[] options8 = {
                    "Taj Mahal","Eiffel Tower","The Colosseum","Chichen Itza"
            };

            PreguntaSinImagen textQuestion8 = new PreguntaSinImagen(
                    "It's not a wonder of the modern world:",
                    Constant.TYPE_SOCIALES,
                    options8,
                    "Eiffel Tower"
            );
            data.add(textQuestion8);

            String[] options9 = {
                    "Charon","Kratos","Cerberus","Persephone"
            };

            PreguntaSinImagen textQuestion9 = new PreguntaSinImagen(
                    "Is the ferryman of Hades:",
                    Constant.TYPE_SOCIALES,
                    options9,
                    "Charon"
            );
            data.add(textQuestion9);

            String[] options10 = {
                    "Po","Sesia","Esk","Pellice"
            };

            PreguntaSinImagen textQuestion10 = new PreguntaSinImagen(
                    "It's not a italian river:",
                    Constant.TYPE_SOCIALES,
                    options10,
                    "Esk"
            );
            data.add(textQuestion10);
            String[] options11 = {
                    "Blue and white","Blue, white and black","Red, black and yellow","Red, white and black"
            };

            PreguntaSinImagen textQuestion11 = new PreguntaSinImagen(
                    "What are the colors of the flag of Egypt?",
                    Constant.TYPE_SOCIALES,
                    options11,
                    "Red, white and black"
            );
            data.add(textQuestion11);
            //endregion

            //region 441-450 Sociales  Ingles Duban

            String[] options441 = {
                    "1895","1942","1912","1927"
            };
            PreguntaSinImagen textQuestion441 = new PreguntaSinImagen(
                    "Year of Titanic sinking?",
                    Constant.TYPE_SOCIALES,
                    options441,
                    "1912"
            );
            data.add(textQuestion441);

            String[] options442 = {
                    "186","241","196","206"
            };
            PreguntaSinImagen textQuestion442 = new PreguntaSinImagen(
                    "How many countries are there in the world?",
                    Constant.TYPE_SOCIALES,
                    options442,
                    "196"
            );
            data.add(textQuestion442);

            String[] options443 = {
                    "Latitude","Length","Decline","Nothing"
            };
            PreguntaSinImagen textQuestion443 = new PreguntaSinImagen(
                    "What is specified from the line of Ecuador?",
                    Constant.TYPE_SOCIALES,
                    options443,
                    "Latitude"
            );
            data.add(textQuestion443);

            String[] options444 = {
                    "Michael Jackson","Werner Heisenberg","Simón Bolivar","Socrates"
            };
            PreguntaSinImagen textQuestion444 = new PreguntaSinImagen(
                    "Who \"I knew I did not know anything\"?",
                    Constant.TYPE_SOCIALES,
                    options444,
                    "Socrates"
            );
            data.add(textQuestion444);

            String[] options445 = {
                    "1993","1986","1997","1975"
            };
            PreguntaSinImagen textQuestion445 = new PreguntaSinImagen(
                    "Date of the Challenger accident",
                    Constant.TYPE_SOCIALES,
                    options445,
                    "1986"
            );
            data.add(textQuestion445);

            String[] options446 = {
                    "Mechanics","Braille","Phonological","Scanning"
            };
            PreguntaSinImagen textQuestion446 = new PreguntaSinImagen(
                    "Name of the reading system for the blind",
                    Constant.TYPE_SOCIALES,
                    options446,
                    "Braille"
            );
            data.add(textQuestion446);

            String[] options447 = {
                    "Canada", "Russia", "Italy", "China"
            };
            PreguntaSinImagen textQuestion447 = new PreguntaSinImagen(
                    "Which of the following is not a G-8 member?",
                    Constant.TYPE_SOCIALES,
                    options447,
                    "China"
            );
            data.add(textQuestion447);

            String[] options448 = {
                    "Dolar","Sestercios","Denar","Diet"
            };
            PreguntaSinImagen textQuestion448 = new PreguntaSinImagen(
                    "What is the name of the Macedonian currency?",
                    Constant.TYPE_SOCIALES,
                    options448,
                    "Denar"
            );
            data.add(textQuestion448);

            String[] options449 = {
                    "1990","2006","1975","2002"
            };
            PreguntaSinImagen textQuestion449 = new PreguntaSinImagen(
                    "Year of death of Augusto Pinochet",
                    Constant.TYPE_SOCIALES,
                    options449,
                    "2006"
            );
            data.add(textQuestion449);

            String[] options450 = {
                    "I love","I read","I exist","I think"
            };
            PreguntaSinImagen textQuestion450 = new PreguntaSinImagen(
                    "I think and then ....",
                    Constant.TYPE_SOCIALES,
                    options450,
                    "I exist"
            );
            data.add(textQuestion450);


            //endregion

            //region PREGUNTA 300
            String[] options300={
                    "South","North","In both","Ecuador"
            };
            PreguntaSinImagen textQuestion300= new PreguntaSinImagen(
                    "In which hemisphere is Colombia located?",
                    Constant.TYPE_SOCIALES,
                    options300,
                    "In both"
            );
            data.add(textQuestion300);
            //endregion

            //region PREGUNTA 301
            String[] options301={
                    "England","Japan","USA","Germany"
            };
            PreguntaSinImagen textQuestion301= new PreguntaSinImagen(
                    "What was the first nation of the Axis Powers during World War II?",
                    Constant.TYPE_SOCIALES,
                    options301,
                    "Germany"
            );
            data.add(textQuestion301);
            //endregion

            //region PREGUNTA 302
            String[] options302={
                    "6","5","7","8"
            };
            PreguntaSinImagen textQuestion302= new PreguntaSinImagen(
                    "How many regions does Colombia have?",
                    Constant.TYPE_SOCIALES,
                    options302,
                    "6"
            );
            data.add(textQuestion302);
            //endregion

            //region PREGUNTA 303
            String[] options303={
                    "Fez","Marrakech","Rabat","Dali"
            };
            PreguntaSinImagen textQuestion303= new PreguntaSinImagen(
                    "What is te capital of Morocco?",
                    Constant.TYPE_SOCIALES,
                    options303,
                    "Rabat"
            );
            data.add(textQuestion303);
            //endregion

            //region PREGUNTA 304
            String[] options304={
                    "Joaquin Guzman","Pablo Escobar","Raul Reyes","None of above"
            };
            PreguntaSinImagen textQuestion304= new PreguntaSinImagen(
                    "Who killed Rodrigo Lara?",
                    Constant.TYPE_SOCIALES,
                    options304,
                    "Pablo Escobar"
            );
            data.add(textQuestion304);
            //endregion

            //region PREGUNTA 305
            String[] options305={
                    "America","Europe","Africa","Asia"
            };
            PreguntaSinImagen textQuestion305= new PreguntaSinImagen(
                    "Where is Tibet located?",
                    Constant.TYPE_SOCIALES,
                    options305,
                    "Asia"
            );
            data.add(textQuestion305);
            //endregion

            //region PREGUNTA 306
            String[] opciones306={
                    "China","Japan","USA","Rome"
            };
            PreguntaSinImagen preguntaConTexto306= new PreguntaSinImagen(
                    "What was the only non-European colonial empire?",
                    Constant.TYPE_SOCIALES,
                    opciones306,
                    "Japan"
            );
            data.add(preguntaConTexto306);
            //endregion

            //region PREGUNTA 307
            String[] opciones307={
                    "1537","1485","1492","1475"
            };
            PreguntaSinImagen preguntaConTexto307= new PreguntaSinImagen(
                    "When was America discovered?",
                    Constant.TYPE_SOCIALES,
                    opciones307,
                    "1492"
            );
            data.add(preguntaConTexto307);
            //endregion

            //region PREGUNTA 308
            String[] opciones308={
                    "Bern","Zurich","Geneve","Basel"
            };
            PreguntaSinImagen preguntaConTexto308= new PreguntaSinImagen(
                    "What is the capital of Switzerland",
                    Constant.TYPE_SOCIALES,
                    opciones308,
                    "Bern"
            );
            data.add(preguntaConTexto308);
            //endregion

            //region PREGUNTA 309
            String[] opciones309={
                    "Meta","Guainia","Vaupés","Cundinamarca"
            };
            PreguntaSinImagen preguntaConTexto309= new PreguntaSinImagen(
                    "Where is the Mapiripana city?",
                    Constant.TYPE_SOCIALES,
                    opciones309,
                    "Guainia"
            );
            data.add(preguntaConTexto309);
            //endregion

            //region PREGUNTA 310
            String[] opciones310={
                    "6. August 1945","5. August 1945", "6 August 1946","10 August 1945"
            };
            PreguntaSinImagen preguntaConTexto310= new PreguntaSinImagen(
                    "When was the Hiroshima atomic bomb launched?",
                    Constant.TYPE_SOCIALES,
                    opciones310,
                    "6. August 1945"
            );
            data.add(preguntaConTexto310);
            //endregion


        }

        else {
            String[] opciones1={ "Moscú","Bogotá","Turín","Atenas"};
            PreguntaSinImagen preguntaConTexto1= new PreguntaSinImagen(
                    "¿Cuál es la capital de Colombia?",
                    Constant.TYPE_SOCIALES,
                    opciones1,
                    "Bogotá"
            );
            data.add(preguntaConTexto1);

            //region 41-450 Sociales Duban


            String[] opciones441= {
                    "1895","1942","1912","1927"
            };
            PreguntaSinImagen preguntaConTexto441= new PreguntaSinImagen(
                    "¿Año del hundimiento del Titanic?",
                    Constant.TYPE_SOCIALES,
                    opciones441,
                    "1912"
            );
            data.add(preguntaConTexto441);

            String[] opciones442= {
                    "186","241","196","206"
            };
            PreguntaSinImagen preguntaConTexto442= new PreguntaSinImagen(
                    "¿Cuantos paises hay en el mundo?",
                    Constant.TYPE_SOCIALES,
                    opciones442,
                    "196"
            );
            data.add(preguntaConTexto442);

            String[] opciones443= {
                    "Latitud","Longitud","Declinación","Nada"
            };
            PreguntaSinImagen preguntaConTexto443= new PreguntaSinImagen(
                    "¿Que se especifica desde la linea del Ecuador?",
                    Constant.TYPE_SOCIALES,
                    opciones443,
                    "Latitud"
            );
            data.add(preguntaConTexto443);

            String[] opciones444= {
                    "Michael Jackson","Werner Heisenberg","Simón Bolivar","Socrates"
            };
            PreguntaSinImagen preguntaConTexto444= new PreguntaSinImagen(
                    "¿Quien \"Sabía que no sabia nada\"?",
                    Constant.TYPE_SOCIALES,
                    opciones444,
                    "Socrates"
            );
            data.add(preguntaConTexto444);

            String[] opciones445= {
                    "1993","1986","1997","1975"
            };
            PreguntaSinImagen preguntaConTexto445= new PreguntaSinImagen(
                    "Fecha del accidente del Challenger?",
                    Constant.TYPE_SOCIALES,
                    opciones445,
                    "1986"
            );
            data.add(preguntaConTexto445);

            String[] opciones446= {
                    "Mecánica","Braille","Fonológica","Escaneo"
            };
            PreguntaSinImagen preguntaConTexto446= new PreguntaSinImagen(
                    "Nombre del sistema de lectura para personas invidentes",
                    Constant.TYPE_SOCIALES,
                    opciones446,
                    "Braille"
            );
            data.add(preguntaConTexto446);

            String[] opciones447= {
                    "Canadá","Rusia","Italia","China"
            };
            PreguntaSinImagen preguntaConTexto447= new PreguntaSinImagen(
                    "¿Cuál de los siguientes no es miembro del G-8?",
                    Constant.TYPE_SOCIALES,
                    opciones447,
                    "China"
            );
            data.add(preguntaConTexto447);

            String[] opciones448= {
                    "Dolar","Sestercios","Denar","Diet"
            };
            PreguntaSinImagen preguntaConTexto448= new PreguntaSinImagen(
                    "¿Cómo se llama la divisa de Macedonia?",
                    Constant.TYPE_SOCIALES,
                    opciones448,
                    "Denar"
            );
            data.add(preguntaConTexto448);

            String[] opciones449= {
                    "1990","2006","1975","2002"
            };
            PreguntaSinImagen preguntaConTexto449= new PreguntaSinImagen(
                    "Año de muerte de Augusto Pinochet",
                    Constant.TYPE_SOCIALES,
                    opciones449,
                    "2006"
            );
            data.add(preguntaConTexto449);

            String[] opciones450= {
                    "Amo","Leo","Existo","Pienso"
            };
            PreguntaSinImagen preguntaConTexto450= new PreguntaSinImagen(
                    "Pienso y luego....",
                    Constant.TYPE_SOCIALES,
                    opciones450,
                    "Existo"
            );
            data.add(preguntaConTexto450);

            //endregion

            //region PREGUNTA 300
            String[] opciones300={
                    "En los dos","Norte","Sur","Ecuador"
            };
            PreguntaSinImagen preguntaConTexto300= new PreguntaSinImagen(
                    "¿En qué hemisferio está situado Colombia?",
                    Constant.TYPE_SOCIALES,
                    opciones300,
                    "En los dos"
            );
            data.add(preguntaConTexto300);
            //endregion

            //region PREGUNTA 301
            String[] opciones301={
                    "Alemania","Japon","Estados Unidos","Inglaterra"
            };
            PreguntaSinImagen preguntaConTexto301= new PreguntaSinImagen(
                    "¿Cuál fue la primera nación de las potencias del eje durante la segunda guerra mundial?",
                    Constant.TYPE_SOCIALES,
                    opciones301,
                    "Alemania"
            );
            data.add(preguntaConTexto301);
            //endregion

            //region PREGUNTA 302
            String[] opciones302={
                    "6","5","7","8"
            };
            PreguntaSinImagen preguntaConTexto302= new PreguntaSinImagen(
                    "¿Cuántas regiones componen la geografía colombiana?",
                    Constant.TYPE_SOCIALES,
                    opciones302,
                    "6"
            );
            data.add(preguntaConTexto302);
            //endregion

            //region PREGUNTA 303
            String[] opciones303={
                    "Rabat","Fez","Marrakech","Dali"
            };
            PreguntaSinImagen preguntaConTexto303= new PreguntaSinImagen(
                    "¿Cuál es la capital de Marruecos?",
                    Constant.TYPE_SOCIALES,
                    opciones303,
                    "Rabat"
            );
            data.add(preguntaConTexto303);
            //endregion

            //region PREGUNTA 304
            String[] opciones304={
                    "Pablo Escobar","Joaquin Guzman","Raul Reyes","Ninguna de las anteriores"
            };
            PreguntaSinImagen preguntaConTexto304= new PreguntaSinImagen(
                    "¿Quién mató a Rodrigo Lara?",
                    Constant.TYPE_SOCIALES,
                    opciones304,
                    "Pablo Escobar"
            );
            data.add(preguntaConTexto304);
            //endregion

            //region PREGUNTA 305
            String[] opciones305={
                    "Asia","America","Europa","Africa"
            };
            PreguntaSinImagen preguntaConTexto305= new PreguntaSinImagen(
                    "¿Dónde está ubicado Tibet?",
                    Constant.TYPE_SOCIALES,
                    opciones305,
                    "Asia"
            );
            data.add(preguntaConTexto305);
            //endregion

            //region PREGUNTA 306
            String[] opciones306={
                    "China","Japón","Estados Unidos","Roma"
            };
            PreguntaSinImagen preguntaConTexto306= new PreguntaSinImagen(
                    "¿Cuál fue el único Imperio Colonial NO Eruopeo?",
                    Constant.TYPE_SOCIALES,
                    opciones306,
                    "Japón"
            );
            data.add(preguntaConTexto306);
            //endregion

            //region PREGUNTA 307
            String[] opciones307={
                    "1537","1485","1492","1475"
            };
            PreguntaSinImagen preguntaConTexto307= new PreguntaSinImagen(
                    "¿Cuándo fue el descubrimiento de América?",
                    Constant.TYPE_SOCIALES,
                    opciones307,
                    "1492"
            );
            data.add(preguntaConTexto307);
            //endregion

            //region PREGUNTA 308
            String[] opciones308={
                    "Berna","Zurich","Ginebra","Ninguna de las anteriores"
            };
            PreguntaSinImagen preguntaConTexto308= new PreguntaSinImagen(
                    "¿Cuál es la capital de Suiza?",
                    Constant.TYPE_SOCIALES,
                    opciones308,
                    "Berna"
            );
            data.add(preguntaConTexto308);
            //endregion

            //region PREGUNTA 309
            String[] opciones309={
                    "Guainia","Meta","Vaupés","Cundinamarca"
            };
            PreguntaSinImagen preguntaConTexto309= new PreguntaSinImagen(
                    "¿Dónde queda el municipio de Mapiripana?",
                    Constant.TYPE_SOCIALES,
                    opciones309,
                    "Guainia"
            );
            data.add(preguntaConTexto309);
            //endregion

            //region PREGUNTA 310
            String[] opciones310={
                    "6 de Agosto de 1945","5 de Agosto de 1945", "6 de Agosto de 1946","10 de Agosto de 1945"
            };
            PreguntaSinImagen preguntaConTexto310= new PreguntaSinImagen(
                    "¿Cuándo fue lanzada la bomba atómica de Hiroshima?",
                    Constant.TYPE_SOCIALES,
                    opciones310,
                    "6 de Agosto de 1945"
            );
            data.add(preguntaConTexto310);
            //endregion

            //region PREGUNTAS

            String[] opciones2 = {
                    "La paz","Sucre","Punata","Medellin"
            };

            PreguntaSinImagen preguntaConTexto2 = new PreguntaSinImagen(
                    "¿Cuál es la capital de Bolivia?",
                    Constant.TYPE_SOCIALES,
                    opciones2,
                    "Sucre"
            );
            data.add(preguntaConTexto2);

            String[] opciones3 = {
                    "Marzo 30, 1958","Abril 9, 1949","Abril 9, 1948","Septiembre 19, 1947"
            };

            PreguntaSinImagen preguntaConTexto3 = new PreguntaSinImagen(
                    "¿Qué día fue el asesinato de Jorge Eliecer Gaitán?",
                    Constant.TYPE_SOCIALES,
                    opciones3,
                    "Abril 9, 1948"
            );
            data.add(preguntaConTexto3);

            String[] opciones4 = {
                    "Libertad, Respeto, Paz","Libertad, Respeto, Amor","Libertad, Paz, Amor","Libertad, Igualdad, Fraternidad"
            };

            PreguntaSinImagen preguntaConTexto4 = new PreguntaSinImagen(
                    "Los principios de la revolución francesa fueron:",
                    Constant.TYPE_SOCIALES,
                    opciones4,
                    "Libertad, Igualdad, Fraternidad"
            );
            data.add(preguntaConTexto4);

            String[] opciones5 = {
                    "Barbados","Andorra","Monaco","Liechtenstein"
            };

            PreguntaSinImagen preguntaConTexto5 = new PreguntaSinImagen(
                    "No es un microestado europeo",
                    Constant.TYPE_SOCIALES,
                    opciones5,
                    "Barbados"
            );
            data.add(preguntaConTexto5);

            String[] opciones6 = {
                    "Ares","Thor","Ull","Tyr"
            };

            PreguntaSinImagen preguntaConTexto6 = new PreguntaSinImagen(
                    "Dios nórdico de la guerra:",
                    Constant.TYPE_SOCIALES,
                    opciones6,
                    "Tyr"
            );
            data.add(preguntaConTexto6);

            String[] opciones7 = {
                    "Francia","Reino Unido","España","Alemania"
            };

            PreguntaSinImagen preguntaConTexto7 = new PreguntaSinImagen(
                    "¿Donde murió Napoleón?",
                    Constant.TYPE_SOCIALES,
                    opciones7,
                    "Reino Unido"
            );
            data.add(preguntaConTexto7);

            String[] opciones8 = {
                    "Taj Mahal","Torre Eiffel","El coliseo","Chichen Itza"
            };

            PreguntaSinImagen preguntaConTexto8 = new PreguntaSinImagen(
                    "No es una maravilla del mundo moderno:",
                    Constant.TYPE_SOCIALES,
                    opciones8,
                    "Torre Eiffel"
            );
            data.add(preguntaConTexto8);

            String[] opciones9 = {
                    "Caronte","Kratos","Cerbero","Persefone"
            };

            PreguntaSinImagen preguntaConTexto9 = new PreguntaSinImagen(
                    "Es el barquero de Hades",
                    Constant.TYPE_SOCIALES,
                    opciones9,
                    "Caronte"
            );
            data.add(preguntaConTexto9);

            String[] opciones10 = {
                    "Po","Sesia","Esk","Pellice"
            };

            PreguntaSinImagen preguntaConTexto10 = new PreguntaSinImagen(
                    "No es un rio italiano:",
                    Constant.TYPE_SOCIALES,
                    opciones10,
                    "Esk"
            );
            data.add(preguntaConTexto10);
            String[] opciones11 = {
                    "Azul y Blanco","Azul, blanco y negro","Rojo, negro y amarillo","Rojo,blanco y negro"
            };

            PreguntaSinImagen preguntaConTexto11 = new PreguntaSinImagen(
                    "¿Cuáles son los colores de la bandera de Egipto?",
                    Constant.TYPE_SOCIALES,
                    opciones11,
                    "Rojo,blanco y negro"
            );
            data.add(preguntaConTexto11);
            //endregion
        }
        return data;
    }
    public List<PreguntaSinImagen> getPreguntasConTextArte(){

        List<PreguntaSinImagen> data = new ArrayList<>();

        if (isEnglish){


            //region PREGUNTAS
            String[] options1 = {
                    "Tom Cruise", "Will Arnett", "Ben Affleck","Robin Williams"
            };

            PreguntaSinImagen textQuestion1 = new PreguntaSinImagen(
                    "Wich actor was part of Jumanji?",
                    Constant.TYPE_ARTES,
                    options1,
                    "Robin Williams"
            );

            data.add(textQuestion1);

            String[] options2 = {
                    "Pablo Picasso", "Fernando Botero", "Alejandro Obregon","Salvador Dali"
            };

            PreguntaSinImagen textQuestion2 = new PreguntaSinImagen(
                    "Famous artist for making fat his characters:",
                    Constant.TYPE_ARTES,
                    options2,
                    "Fernando Botero"
            );

            data.add(textQuestion2);

            String[] options3 = {
                    "Spring", "The hymn of joy", "The weddings of figaro","The Turkish march"
            };

            PreguntaSinImagen textQuestion3 = new PreguntaSinImagen(
                    "The third movement of Mozart's piano number 11 is known as: ",
                    Constant.TYPE_ARTES,
                    options3,
                    "The Turkish march"
            );

            data.add(textQuestion3);

            String[] options4 = {
                    "The artist", "El abrazo de la serpiente", "The King's Speech","The Hurt Locker"
            };

            PreguntaSinImagen textQuestion4 = new PreguntaSinImagen(
                    "Winner of the Oscar for best film in 2010: ",
                    Constant.TYPE_ARTES,
                    options4,
                    "The King's Speech"
            );

            data.add(textQuestion4);

            String[] options5 = {
                    "Iron Man", "Hulk", "Sherlock Holmes","Frankenstein"
            };

            PreguntaSinImagen textQuestion5 = new PreguntaSinImagen(
                    "Fictional character created by Mary Shelley: ",
                    Constant.TYPE_ARTES,
                    options5,
                    "Frankenstein"
            );

            data.add(textQuestion5);

            String[] options6 = {
                    "Giuseppe Tartini","Niccolò Paganini","Antonio Vivaldi","Johann Sebastian Bach"
            };
            PreguntaSinImagen textQuestion6 = new PreguntaSinImagen(
                    "Violinist nicknamed The Devil's Violinist: ",
                    Constant.TYPE_ARTES,
                    options6,
                    "Niccolò Paganini"
            );
            data.add(textQuestion6);

            String[] options7 = {
                    "Rock","Funck","Jazz","Blues"
            };
            PreguntaSinImagen textQuestion7 = new PreguntaSinImagen(
                    "Charlie Parker was a composer of: ",
                    Constant.TYPE_ARTES,
                    options7,
                    "Jazz"
            );
            data.add(textQuestion7);
            String[] options8 = {
                    "The Tunnel","The cave","The Double","Blindness"
            };
            PreguntaSinImagen textQuestion8 = new PreguntaSinImagen(
                    "It was not written by Jose Saramago: ",
                    Constant.TYPE_ARTES,
                    options8,
                    "The Tunnel"
            );
            data.add(textQuestion8);

            String[] options9 = {
                    "Blindness","The cave","The Double","All of the above"
            };
            PreguntaSinImagen textQuestion9 = new PreguntaSinImagen(
                    "It was written by Jose Saramago: ",
                    Constant.TYPE_ARTES,
                    options9,
                    "All of the above"
            );
            data.add(textQuestion9);

            String[] options10 = {
                    "Mario Vargas Llosa","Jose Saramago","Gabriel Garcia Marquez","Miguel de Cervantes"
            };
            PreguntaSinImagen textQuestion10 = new PreguntaSinImagen(
                    "Winner of the Nobel Prize for literature in 2010 : ",
                    Constant.TYPE_ARTES,
                    options10,
                    "Mario Vargas Llosa"
            );
            data.add(textQuestion10);

            //endregion


            //region 461-470 Artes Ingles Duban




            String[] options461 = {
                    "Ernest Hemingway","Norman Mailer","Gabriel García Márquez","Truman Capote"
            };
            PreguntaSinImagen textQuestion461 = new PreguntaSinImagen(
                    "Who wrote \"The old man and the sea\"?",
                    Constant.TYPE_ARTES,
                    options461,
                    "Ernest Hemingway"
            );
            data.add(textQuestion461);

            String[] options462 = {
                    "Kill","Escape","Marry","Play"
            };
            PreguntaSinImagen textQuestion462 = new PreguntaSinImagen(
                    "Rice with milk I want ....",
                    Constant.TYPE_ARTES,
                    options462,
                    "Marry"
            );
            data.add(textQuestion462);

            String[] options463 = {
                    "Mockingbird","Owl","Flames","Crow"
            };
            PreguntaSinImagen textQuestion463 = new PreguntaSinImagen(
                    "What is the bird symbol of the Hunger Games called?",
                    Constant.TYPE_ARTES,
                    options463,
                    "Mockingbird"
            );
            data.add(textQuestion463);

            String[] options464 = {
                    "Love","42","Share","777"
            };
            PreguntaSinImagen textQuestion464 = new PreguntaSinImagen(
                    "What is the meaning of life in the universe and everything else?",
                    Constant.TYPE_ARTES,
                    options464,
                    "42"
            );
            data.add(textQuestion464);

            String[] options465 = {
                    "Bogota","Gendia","Catay","Macondo"
            };
            PreguntaSinImagen textQuestion465 = new PreguntaSinImagen(
                    "What is the fictional town described in 100 years of solitude, of García Márquez?",
                    Constant.TYPE_ARTES,
                    options465,
                    "Macondo"
            );
            data.add(textQuestion465);

            String[] options466 = {
                    "Michael Jackson","Marilyn Monroe","Zac Efron","Zayn Malik"
            };
            PreguntaSinImagen textQuestion466 = new PreguntaSinImagen(
                    "Who is known as the King of Pop? ",
                    Constant.TYPE_ARTES,
                    options466,
                    "Michael Jackson"
            );
            data.add(textQuestion466);

            String[] options467 = {
                    "Oscar Awards","Cannes Award","Ariel Award","Astor Award"
            };
            PreguntaSinImagen textQuestion467 = new PreguntaSinImagen(
                    "Maximum recognition in the film industry?",
                    Constant.TYPE_ARTES,
                    options467,
                    "Oscar Awards"
            );
            data.add(textQuestion467);

            String[] options468 = {
                    "Conan","Watson","Jarvis","Sancho"
            };
            PreguntaSinImagen textQuestion468 = new PreguntaSinImagen(
                    "Name of Sherlock Holmes's Mate",
                    Constant.TYPE_ARTES,
                    options468,
                    "Watson"
            );
            data.add(textQuestion468);

            String[] options469 = {
                    "Cinema","Poetry","Music","Architecture"
            };
            PreguntaSinImagen textQuestion469 = new PreguntaSinImagen(
                    "It is called as the first art,",
                    Constant.TYPE_ARTES,
                    options469,
                    "Architecture"
            );
            data.add(textQuestion469);

            String[] options470 = {
                    "Cinema","Ballet","Sculpture","Music"
            };
            PreguntaSinImagen textQuestion470= new PreguntaSinImagen(
                    "\"It's not a scenic art",
                    Constant.TYPE_ARTES,
                    options470,
                    "Sculpture"
            );
            data.add(textQuestion470);
            //endregion

            //region PREGUNTA 330
            String[] options330={
                    "Chopin","Beethoven","Mozart","Franz Liszt"
            };

            PreguntaSinImagen textQuestion330= new PreguntaSinImagen(
                    "Which of the composers died younger?",
                    Constant.TYPE_ARTES,
                    options330,
                    "Mozart"
            );
            data.add(textQuestion330);
            //endregion

            //region PREGUNTA 331
            String[] options331={
                    "Edvard Munch","Lonardo da Vinci","Picasso","Salvador Dalí"
            };

            PreguntaSinImagen textQuestion331= new PreguntaSinImagen(
                    "Who painted 'The last dinner'?",
                    Constant.TYPE_ARTES,
                    options331,
                    "Leonardo da Vinci"
            );
            data.add(textQuestion331);
            //endregion

            //region PREGUNTA 332
            String[] opciones332={
                    "Christopher Nolan","Jenifer Todd","Suzanne Todd","Wally Pfister"
            };

            PreguntaSinImagen preguntaConTexto332= new PreguntaSinImagen(
                    "Who is the director of the movie Memento?",
                    Constant.TYPE_ARTES,
                    opciones332,
                    "Christopher Nolan"
            );
            data.add(preguntaConTexto332);
            //endregion

            //region PREGUNTA 333
            String[] options333={
                    "5","11","8","3"
            };

            PreguntaSinImagen textQuestion333= new PreguntaSinImagen(
                    "How many Oscar awards has the movie Titanic won?",
                    Constant.TYPE_ARTES,
                    options333,
                    "11"
            );
            data.add(textQuestion333);
            //endregion

            //region PREGUNTA 334
            String[] options334={
                    "7.5 km","5000m","6km","8000m"
            };

            PreguntaSinImagen textQuestion334= new PreguntaSinImagen(
                    "How long is the largest in the world painted by one person?",
                    Constant.TYPE_ARTES,
                    options334,
                    "8000m"
            );
            data.add(textQuestion334);
            //endregion

            //region PREGUNTA 335
            String[] opciones335={
                    "Winter Palace","Louvre Museum","Gagosian Gallery","Matthew Marks Gallery"
            };

            PreguntaSinImagen preguntaConTexto335= new PreguntaSinImagen(
                    "What is the largest art gallery in the world?",
                    Constant.TYPE_ARTES,
                    opciones335,
                    "Winter Palace"
            );
            data.add(preguntaConTexto335);
            //endregion

            //region PREGUNTA 336
            String[] options336={
                    "Van Gogh","Dalí","Monet","Rembrandt"
            };

            PreguntaSinImagen textQuestion336= new PreguntaSinImagen(
                    "Who painted 'The Christ without thorns and without blood'?",
                    Constant.TYPE_ARTES,
                    options336,
                    "Dalí"
            );
            data.add(textQuestion336);
            //endregion

            //region PREGUNTA 337
            String[] options337={
                    "Van Gogh","El Greco","El Bosco","Caravaggio"
            };

            PreguntaSinImagen textQuestion337= new PreguntaSinImagen(
                    "Who painted 'The Garden of Delights'?",
                    Constant.TYPE_ARTES,
                    options337,
                    "El Bosco"
            );
            data.add(textQuestion337);
            //endregion

            //region PREGUNTA 338
            String[] options338={
                    "Cézanne","Degas","Renoir","Courbet"
            };

            PreguntaSinImagen textQuestion338= new PreguntaSinImagen(
                    "Who was rejected by the Ecole des Beaux-Arts?",
                    Constant.TYPE_ARTES,
                    options338,
                    "Cézanne"
            );
            data.add(textQuestion338);
            //endregion

            //region PREGUNTA 339
            String[] options339={
                    "5","15","27","20"
            };

            PreguntaSinImagen textQuestion339= new PreguntaSinImagen(
                    "How old was Van Gogh, when he beban to paint?",
                    Constant.TYPE_ARTES,
                    options339,
                    "27"
            );
            data.add(textQuestion339);
            //endregion


        }

        else {

            String[] opciones1={
                    "Tom Cruise", "Will Arnett", "Ben Affleck","Robin Williams"
            };

            PreguntaSinImagen preguntaConTexto1= new PreguntaSinImagen(
                    "¿Qué actor hizo parte de Jumanji?",
                    Constant.TYPE_ARTES,
                    opciones1,
                    "Robin Williams"
            );
            data.add(preguntaConTexto1);


            //region 461-470 Artes Duban


            String[] opciones461={
                    "Ernest Hemingway","Norman Mailer","Gabriel García Márquez","Truman Capote"
            };
            PreguntaSinImagen preguntaConTexto461= new PreguntaSinImagen(
                    "¿Quién escribió “El viejo y el mar?",
                    Constant.TYPE_ARTES,
                    opciones461,
                    "Ernest Hemingway"
            );
            data.add(preguntaConTexto461);

            String[] opciones462={
                    "Matar","Escapar","Casar","Jugar"
            };
            PreguntaSinImagen preguntaConTexto462= new PreguntaSinImagen(
                    "Arroz con leche me quiero ....",
                    Constant.TYPE_ARTES,
                    opciones462,
                    "Casar"
            );
            data.add(preguntaConTexto462);

            String[] opciones463={
                    "Sinsajo","Lechuza","Llamas","Cuervo"
            };
            PreguntaSinImagen preguntaConTexto463= new PreguntaSinImagen(
                    "¿Cómo se llama el pájaro símbolo de los Juegos del Hambre?",
                    Constant.TYPE_ARTES,
                    opciones463,
                    "Sinsajo"
            );
            data.add(preguntaConTexto463);

            String[] opciones464={
                    "amar","42","Compartir","777"
            };
            PreguntaSinImagen preguntaConTexto464= new PreguntaSinImagen(
                    "¿Cuál es el sentido de la vida el universo y todo lo demas?",
                    Constant.TYPE_ARTES,
                    opciones464,
                    "42"
            );
            data.add(preguntaConTexto464);

            String[] opciones465={
                    "Bogotá","Gendia","Catay","Macondo"
            };
            PreguntaSinImagen preguntaConTexto465= new PreguntaSinImagen(
                    "¿Cual es el pueblo ficticio descrito en 100 años de soledad, de García Márquez? ",
                    Constant.TYPE_ARTES,
                    opciones465,
                    "Macondo"
            );
            data.add(preguntaConTexto465);

            String[] opciones466={
                    "Michael Jackson","Marilyn Monroe","Zac Efron","Zayn Malik"
            };
            PreguntaSinImagen preguntaConTexto466= new PreguntaSinImagen(
                    "¿A quién se le conoce como el Rey del Pop?",
                    Constant.TYPE_ARTES,
                    opciones466,
                    "Michael Jackson"
            );
            data.add(preguntaConTexto466);

            String[] opciones467={
                    "Premios Óscar","Premio de cannes","Premio Ariel","Premio Astor"
            };
            PreguntaSinImagen preguntaConTexto467= new PreguntaSinImagen(
                    "¿Máximo reconocimiento en la industria cinematográfica?",
                    Constant.TYPE_ARTES,
                    opciones467,
                    "Premios Óscar"
            );
            data.add(preguntaConTexto467);

            String[] opciones468={
                    "Conan","Watson","Jarvis","Sancho"
            };
            PreguntaSinImagen preguntaConTexto468= new PreguntaSinImagen(
                    "Nombre del compañero de Sherlock Holmes",
                    Constant.TYPE_ARTES,
                    opciones468,
                    "Watson"
            );
            data.add(preguntaConTexto468);

            String[] opciones469={
                    "Cine","Poesia","Música","Arquitectura"
            };
            PreguntaSinImagen preguntaConTexto469= new PreguntaSinImagen(
                    "Se denomina como el primer arte",
                    Constant.TYPE_ARTES,
                    opciones469,
                    "Arquitectura"
            );
            data.add(preguntaConTexto469);

            String[] opciones470={
                    "Cine","Ballet","Escultura","Música"
            };
            PreguntaSinImagen preguntaConTexto470= new PreguntaSinImagen(
                    "No es una arte escénica",
                    Constant.TYPE_ARTES,
                    opciones470,
                    "Escultura"
            );
            data.add(preguntaConTexto470);



            //endregion

            //region PREGUNTA 330
            String[] opciones330={
                    "Chopin","Beethoven","Mozart","Franz Liszt"
            };

            PreguntaSinImagen preguntaConTexto330= new PreguntaSinImagen(
                    "¿Cuál de los compositores murió más joven?",
                    Constant.TYPE_ARTES,
                    opciones330,
                    "Mozart"
            );
            data.add(preguntaConTexto330);
            //endregion

            //region PREGUNTA 331
            String[] opciones331={
                    "Edvard Munch","Picasso","Leonardo da Vinci","Salvador Dalí"
            };

            PreguntaSinImagen preguntaConTexto331= new PreguntaSinImagen(
                    "¿Quién pintó la última cena?",
                    Constant.TYPE_ARTES,
                    opciones331,
                    "Leonardo da Vinci"
            );
            data.add(preguntaConTexto331);
            //endregion

            //region PREGUNTA 332
            String[] opciones332={
                    "Christopher Nolan","Jenifer Todd","Suzanne Todd","Wally Pfister"
            };

            PreguntaSinImagen preguntaConTexto332= new PreguntaSinImagen(
                    "¿Quién es el director de la película Memento?",
                    Constant.TYPE_ARTES,
                    opciones332,
                    "Christopher Nolan"
            );
            data.add(preguntaConTexto332);
            //endregion

            //region PREGUNTA 333
            String[] opciones333={
                    "11","5","8","3"
            };

            PreguntaSinImagen preguntaConTexto333= new PreguntaSinImagen(
                    "¿Cuántos premios Oscar ha ganado la película Titanic?",
                    Constant.TYPE_ARTES,
                    opciones333,
                    "11"
            );
            data.add(preguntaConTexto333);
            //endregion

            //region PREGUNTA 334
            String[] opciones334={
                    "8000m","7.5 km","5000m","6km"
            };

            PreguntaSinImagen preguntaConTexto334= new PreguntaSinImagen(
                    "¿Cuánto minde la pintura más grande del mundo pintada por una sola persona?",
                    Constant.TYPE_ARTES,
                    opciones334,
                    "8000m"
            );
            data.add(preguntaConTexto334);
            //endregion

            //region PREGUNTA 335
            String[] opciones335={
                    "Palacio de Invierno","Museo de Louvre","Gagosian Gallery","Matthew Marks Gallery"
            };

            PreguntaSinImagen preguntaConTexto335= new PreguntaSinImagen(
                    "¿Cuál es la galería de arte más grande?",
                    Constant.TYPE_ARTES,
                    opciones335,
                    "Palacio de Invierno"
            );
            data.add(preguntaConTexto335);
            //endregion

            //region PREGUNTA 336
            String[] opciones336={
                    "Van Gogh","Dalí","Monet","Rembrandt"
            };

            PreguntaSinImagen preguntaConTexto336= new PreguntaSinImagen(
                    "¿Quién pintó el Cristo sin espinas y sin sangre?",
                    Constant.TYPE_ARTES,
                    opciones336,
                    "Dalí"
            );
            data.add(preguntaConTexto336);
            //endregion

            //region PREGUNTA 337
            String[] opciones337={
                    "Van Gogh","El Greco","El Bosco","Caravaggio"
            };

            PreguntaSinImagen preguntaConTexto337= new PreguntaSinImagen(
                    "¿Quién pintó El jardín de las delicias?",
                    Constant.TYPE_ARTES,
                    opciones337,
                    "El Bosco"
            );
            data.add(preguntaConTexto337);
            //endregion

            //region PREGUNTA 338
            String[] opciones338={
                    "Cézanne","Degas","Renoir","Courbet"
            };

            PreguntaSinImagen preguntaConTexto338= new PreguntaSinImagen(
                    "¿Quién fue rechazado por la Ecole des Beaux-Arts?",
                    Constant.TYPE_ARTES,
                    opciones338,
                    "Cézanne"
            );
            data.add(preguntaConTexto338);
            //endregion

            //region PREGUNTA 339
            String[] opciones339={
                    "5","15","27","20"
            };

            PreguntaSinImagen preguntaConTexto339= new PreguntaSinImagen(
                    "¿A qué edad comenzó a pintar Van Gogh?",
                    Constant.TYPE_ARTES,
                    opciones339,
                    "27"
            );
            data.add(preguntaConTexto339);
            //endregion

            //region PREGUNTAS

            String[] opciones2={
                    "Pablo Picasso", "Fernando Botero", "Alejandro Obregon","Salvador Dali"
            };

            PreguntaSinImagen preguntaConTexto2= new PreguntaSinImagen(
                    "Artista famoso por hacer gordos sus personajes: ",
                    Constant.TYPE_ARTES,
                    opciones2,
                    "Fernando Botero"
            );
            data.add(preguntaConTexto2);

            String[] opciones3={
                    "La primavera", "El himno de la alegria", "La marcha turca","Las bodas de figaro"
            };

            PreguntaSinImagen preguntaConTexto3= new PreguntaSinImagen(
                    "El tercer movimiento de la sonata para piano número 11 de Mozart se conoce como: ",
                    Constant.TYPE_ARTES,
                    opciones3,
                    "La marcha turca"
            );
            data.add(preguntaConTexto3);

            String[] opciones4={
                    "The artist", "El abrazo de la serpiente", "The King's Speech","The Hurt Locker"
            };

            PreguntaSinImagen preguntaConTexto4 = new PreguntaSinImagen(
                    "Ganadora del premio Oscar a mejor película en 2010: ",
                    Constant.TYPE_ARTES,
                    opciones4,
                    "The King's Speech"
            );
            data.add(preguntaConTexto4);



            String[] opciones5={
                    "Iron Man", "Hulk", "Sherlock Holmes","Frankenstein"
            };

            PreguntaSinImagen preguntaConTexto5 = new PreguntaSinImagen(
                    "Personaje de ficción creado por Mary Shelley: ",
                    Constant.TYPE_ARTES,
                    opciones5,
                    "Frankenstein"
            );
            data.add(preguntaConTexto5);

            String[] opciones6={
                    "Giuseppe Tartini","Niccolò Paganini","Antonio Vivaldi","Johann Sebastian Bach"
            };
            PreguntaSinImagen preguntaConTexto6 = new PreguntaSinImagen(
                    "Violinista apodado “El violinista del diablo”: ",
                    Constant.TYPE_ARTES,
                    opciones6,
                    "Niccolò Paganini"
            );
            data.add(preguntaConTexto6);

            String[] opciones7={
                    "Rock","Funck","Jazz","Blues"
            };
            PreguntaSinImagen preguntaConTexto7 = new PreguntaSinImagen(
                    "Charlie Parker fue un compositor de: ",
                    Constant.TYPE_ARTES,
                    opciones7,
                    "Jazz"
            );
            data.add(preguntaConTexto7);
            String[] opciones8={
                    "La caverna","Ensayo sobre la ceguera","El hombre duplicado","El tunel"
            };
            PreguntaSinImagen preguntaConTexto8 = new PreguntaSinImagen(
                    "No fue escrito por José Saramago: ",
                    Constant.TYPE_ARTES,
                    opciones8,
                    "El tunel"
            );
            data.add(preguntaConTexto8);
            String[] opciones9={
                    "La caverna","Ensayo sobre la ceguera","El hombre duplicado","Todas las anteriores"
            };
            PreguntaSinImagen preguntaConTexto9 = new PreguntaSinImagen(
                    "Fue escrito por José Saramago: ",
                    Constant.TYPE_ARTES,
                    opciones9,
                    "Todas las anteriores"
            );
            data.add(preguntaConTexto9);
            String[] opciones10={
                    "Mario Vargas Llosa","José Saramago","Gabriel García Márquez","Miguel de Cervantes"
            };
            PreguntaSinImagen preguntaConTexto10 = new PreguntaSinImagen(
                    "Ganador del premio nobel de literatura en 2010: ",
                    Constant.TYPE_ARTES,
                    opciones10,
                    "Mario Vargas Llosa"
            );
            data.add(preguntaConTexto10);

            //endregion

        }
        return data;
    }

    public PreguntaSinImagen getRandomPreguntaSinImagen(List<PreguntaSinImagen> data){
        Random rand = new Random();
        int  n = rand.nextInt(data.size());
        return data.get(n);
    }
}
