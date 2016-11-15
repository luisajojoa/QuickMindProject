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
        }
        return data;
    }

    public List<PreguntaSinImagen> getPreguntasConTextCiencia(){

        List<PreguntaSinImagen> data = new ArrayList<>();

        if (isEnglish){
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



        }
        return data;
    }
    public List<PreguntaSinImagen> getPreguntasConTextSociales(){

        List<PreguntaSinImagen> data = new ArrayList<>();

        if (isEnglish){
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

        }
        return data;
    }
    public List<PreguntaSinImagen> getPreguntasConTextArte(){

        List<PreguntaSinImagen> data = new ArrayList<>();

        if (isEnglish){
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

        }
        return data;
    }

    public PreguntaSinImagen getRandomPreguntaSinImagen(List<PreguntaSinImagen> data){
        Random rand = new Random();
        int  n = rand.nextInt(data.size());
        return data.get(n);
    }
}
