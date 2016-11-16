package com.oop.dubanrosero.quickmindproject.dao;

import com.oop.dubanrosero.quickmindproject.Util.Constant;
import com.oop.dubanrosero.quickmindproject.models.PreguntaConImagen;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by jhon on 11/11/16.
 */

public class PreguntasConImagenDao {
     boolean isEnglish;

    public PreguntasConImagenDao(boolean isEnglish) {
        this.isEnglish = isEnglish;
    }

    public List<PreguntaConImagen> getPreguntasConImagenCiencia(){

        List<PreguntaConImagen> data = new ArrayList<>();

        if (isEnglish){

            //region PREGUNTAS
            String[] options1 = {
                    "Isaac Newton","Tesla","Kirchhoff","Faraday"
            };

            PreguntaConImagen imageQuestion1 = new PreguntaConImagen(
                    "http://www.biografiasyvidas.com/biografia/k/fotos/kirchhoff.jpg",
                    Constant.TYPE_CIENCIAS,
                    options1,
                    "Kirchhoff"
            );

            data.add(imageQuestion1);

            String[] options2 = {
                    "Cyclopentyl","Cyclopentane","Pentyl","Heptyl"
            };

            PreguntaConImagen imageQuestion2 = new PreguntaConImagen(
                    "http://structuresearch.merck-chemicals.com/getImage/MDA_CHEM_818769",
                    Constant.TYPE_CIENCIAS,
                    options2,
                    "Cyclopentane"
            );

            data.add(imageQuestion2);

            String[] options3 = {
                    "Archaea","Bacteriophage","Taenia solium","Helical virus"
            };

            PreguntaConImagen imageQuestion3 = new PreguntaConImagen(
                    "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcQI0PbZSwENcdjwn1lQzZBWCYYm_FMqZUZ-vZl4nWWadxeAZoNTfg",
                    Constant.TYPE_CIENCIAS,
                    options3,
                    "Bacteriophage"
            );

            data.add(imageQuestion3);

            String[] options4 = {
                    "International Space Station","Plank","Hubble Space Telescope","Kepler Space Telescope"
            };

            PreguntaConImagen imageQuestion4 = new PreguntaConImagen(
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSOvowzZSBN3hwX-TUJT6XavWKhDyOUAvulkuLXs3jv0C3k8OgBhg",
                    Constant.TYPE_CIENCIAS,
                    options4,
                    "Hubble Space Telescope"
            );

            data.add(imageQuestion4);

            String[] options5 = {
                    "Mercury","Neptupe","Mars","Jupiter"
            };

            PreguntaConImagen imageQuestion5 = new PreguntaConImagen(
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR4hpBV-85H7sUMHIIzYz7WsSAQGIiZfNqzENl2sb5lV7tpbz4lrg",
                    Constant.TYPE_CIENCIAS,
                    options5,
                    "Neptupe"
            );
            data.add(imageQuestion5);


            String[] options401 = {
                    "Isaac Newton","Tesla","Kirchhoff","Faraday"
            };
            PreguntaConImagen imageQuestion401 = new PreguntaConImagen(
                    "http://www.biografiasyvidas.com/biografia/k/fotos/kirchhoff.jpg",
                    Constant.TYPE_CIENCIAS,
                    options401,
                    "Kirchhoff"
            );
            data.add(imageQuestion401);

            String[] options402 = {
                    "Eagle Nebula","Helix Nebula","Orion Nebula","Andromeda Nebula"
            };
            PreguntaConImagen imageQuestion402 = new PreguntaConImagen(
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b1/NGC7293_%282004%29.jpg/800px-NGC7293_%282004%29.jpg",
                    Constant.TYPE_CIENCIAS,
                    options402,
                    "Helix Nebula"
            );
            data.add(imageQuestion402);

            String[] options403 = {
                    "Hydrocarbons","Peroxide","Carbon Dioxide","Water"
            };
            PreguntaConImagen imageQuestion403 = new PreguntaConImagen(
                    "http://static.naukas.com/media/2012/10/molecula-agua.jpg",
                    Constant.TYPE_CIENCIAS,
                    options403,
                    "Water"
            );
            data.add(imageQuestion403);
            //endregion

            //region PREGUNTA 350
            String[] options350 = {
                    "Big Bear", "Scorpio", "Taurus", "None of the above"
            };

            PreguntaConImagen imageQuestion350 = new PreguntaConImagen(
                    "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcTcwmQPoZ5lTZ1bLGb9h34-7Y-T7vBpvelULNfN3jGWFDCqzqqq",
                    Constant.TYPE_CIENCIAS,
                    options350,
                    "Scorpio"
            );
            data.add(imageQuestion350);
            //endregion

            //region PREGUNTA 351
            String[] options351 = {
                    "Ribosome", "Lysosome", "Mitochondria", "Nucleolus"
            };
            PreguntaConImagen imageQuestion351= new PreguntaConImagen(
                    "https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcTGVNfP59X71z6xHtCQeMPI7zpfO3DnNcP4BvWNUSK_6feAMb5b",
                    Constant.TYPE_CIENCIAS,
                    options351,
                    "Mitochondria"
            );
            data.add(imageQuestion351);
            //endregion

            //region PREGUNTA 352
            String[] options352 = {
                    "Thomas Alva Edison","Nikola Tesla","Ampere","All the above"
            };
            PreguntaConImagen imageQuestion352= new PreguntaConImagen(
                    "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcQ6Vj-V8TLnFqemWdURrqzx2aLxa3eQ3OWb2qPhIhJqQCahdpRw",
                    Constant.TYPE_CIENCIAS,
                    options352,
                    "Thomas Alva Edison"
            );
            data.add(imageQuestion352);
            //endregion

        }

        else {

            //region PREGUNTAS
            String[] opciones1 = {
                    "Isaac Newton","Tesla","Kirchhoff","Faraday"
            };

            PreguntaConImagen preguntaConImagen1 = new PreguntaConImagen(
                    "http://www.biografiasyvidas.com/biografia/k/fotos/kirchhoff.jpg",
                    Constant.TYPE_CIENCIAS,
                    opciones1,
                    "Kirchhoff"
            );
            data.add(preguntaConImagen1);

            String[] opciones401 = {
                    "Isaac Newton","Tesla","Kirchhoff","Faraday"
            };
            PreguntaConImagen preguntaConImagen401 = new PreguntaConImagen(
                    "http://www.biografiasyvidas.com/biografia/k/fotos/kirchhoff.jpg",
                    Constant.TYPE_CIENCIAS,
                    opciones401,
                    "Kirchhoff"
            );
            data.add(preguntaConImagen401);

            String[] opciones402 = {
                    "Nebulosa del Águila","Nebulosa de la Hélice","Nebulosa de Andromeda","Nebulosa de Orion"
            };
            PreguntaConImagen preguntaConImagen402 = new PreguntaConImagen(
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b1/NGC7293_%282004%29.jpg/800px-NGC7293_%282004%29.jpg",
                    Constant.TYPE_CIENCIAS,
                    opciones402,
                    "Nebulosa de la Hélice"
            );
            data.add(preguntaConImagen402);

            String[] opciones403 = {
                    "Agua Oxigenada","Agua","Dioxido de Carbono","Hidrocarburos"
            };
            PreguntaConImagen preguntaConImagen403 = new PreguntaConImagen(
                    "http://static.naukas.com/media/2012/10/molecula-agua.jpg",
                    Constant.TYPE_CIENCIAS,
                    opciones403,
                    "Agua"
            );
            data.add(preguntaConImagen403);
            //endregion

            //region PREGUNTA 350
            String[] opciones350 = {
                    "Osa Mayor","Escorpión","Tauro","Ninguna de las anteriores"
            };

            PreguntaConImagen preguntaConImagen350 = new PreguntaConImagen(
                    "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcTcwmQPoZ5lTZ1bLGb9h34-7Y-T7vBpvelULNfN3jGWFDCqzqqq",
                    Constant.TYPE_CIENCIAS,
                    opciones350,
                    "Escorpión"
            );
            data.add(preguntaConImagen350);
            //endregion

            //region PREGUNTA 351
            String[] opciones351 = {
                    "Ribosoma","Lisosoma","Mitocondria","Nucleolo"
            };
            PreguntaConImagen preguntaConImagen351= new PreguntaConImagen(
                    "https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcTGVNfP59X71z6xHtCQeMPI7zpfO3DnNcP4BvWNUSK_6feAMb5b",
                    Constant.TYPE_CIENCIAS,
                    opciones351,
                    "Mitocondria"
            );
            data.add(preguntaConImagen351);
            //endregion

            //region PREGUNTA 352
            String[] opciones352 = {
                    "Thomas Alva Edison","Nikola Tesla","Ampere","Todos los anteriores"
            };
            PreguntaConImagen preguntaConImagen352= new PreguntaConImagen(
                    "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcQ6Vj-V8TLnFqemWdURrqzx2aLxa3eQ3OWb2qPhIhJqQCahdpRw",
                    Constant.TYPE_CIENCIAS,
                    opciones352,
                    "Thomas Alva Edison"
            );
            data.add(preguntaConImagen352);
            //endregion


            String[] opciones2 = {
                    "Pentanol","Pentano","Ciclopentano","Cicloheptano"
            };

            PreguntaConImagen preguntaConImagen2 = new PreguntaConImagen(
                    "http://structuresearch.merck-chemicals.com/getImage/MDA_CHEM_818769",
                    Constant.TYPE_CIENCIAS,
                    opciones2,
                    "Ciclopentano"
            );
            data.add(preguntaConImagen2);

            String[] opciones3 = {
                    "Taenia solium ","Virus Bacteriófago","Arquea","Virus helicoidal"
            };

            PreguntaConImagen preguntaConImagen3 = new PreguntaConImagen(
                    "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcQI0PbZSwENcdjwn1lQzZBWCYYm_FMqZUZ-vZl4nWWadxeAZoNTfg",
                    Constant.TYPE_CIENCIAS,
                    opciones3,
                    "Virus Bacteriófago"
            );
            data.add(preguntaConImagen3);

            String[] opciones4 = {
                    "Estacion espacial internacional","Plank","Telescopio espacial Hubble","Telescopio espacial Kepler"
            };

            PreguntaConImagen preguntaConImagen4 = new PreguntaConImagen(
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSOvowzZSBN3hwX-TUJT6XavWKhDyOUAvulkuLXs3jv0C3k8OgBhg",
                    Constant.TYPE_CIENCIAS,
                    opciones4,
                    "Telescopio espacial Hubble"
            );
            data.add(preguntaConImagen4);
            String[] opciones5 = {
                    "Mercurio","Neptupo","Marte","Júpiter"
            };

            PreguntaConImagen preguntaConImagen5 = new PreguntaConImagen(
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR4hpBV-85H7sUMHIIzYz7WsSAQGIiZfNqzENl2sb5lV7tpbz4lrg",
                    Constant.TYPE_CIENCIAS,
                    opciones5,
                    "Neptupo"
            );
            data.add(preguntaConImagen5);



        }
        return data;
    }

    public List<PreguntaConImagen> getPreguntasConImagenDeporte(){
        List<PreguntaConImagen> data = new ArrayList<>();
        if (isEnglish){

            //region PREGUNTAS
            String[] options1 = {
                    "Celta de Vigo","Malaga","Cruz Azul","Cuy sabor"
            };

            PreguntaConImagen imageQuestion1 = new PreguntaConImagen(
                    "https://www.ecured.cu/images/thumb/f/f9/Escudo-del-real-club-celta-de-vigo-deportes-escudos-de-futbol-pintado-por-martinb-9769932.jpg/260px-Escudo-del-real-club-celta-de-vigo-deportes-escudos-de-futbol-pintado-por-martinb-9769932.jpg",
                    Constant.TYPE_DEPORTE,
                    options1,
                    "Celta de Vigo"
            );

            data.add(imageQuestion1);


            String[] options411 = {
                    "Samurai","Fencing","Taekwondo","Sword"
            };
            PreguntaConImagen imageQuestion411 = new PreguntaConImagen(
                    "http://www.colegioamoros.org/contenido/uploads/esgrima-02.jpg",
                    Constant.TYPE_DEPORTE,
                    options411,
                    "Fencing"
            );
            data.add(imageQuestion411);

            String[] options412 = {
                    "Lasse Virén","Usain Bolt","Marita Koch","Oscar Pistorius"
            };
            PreguntaConImagen imageQuestion412 = new PreguntaConImagen(
                    "http://www.ewtnnewsonline.com/images/Usain_Bolt_London_Olypmics_Credit_Harry_How_Getty_Images_Sport_Getty_Images_EWTN_US_Catholic_News_8_31_12.jpg",
                    Constant.TYPE_DEPORTE,
                    options412,
                    "Usain Bolt"
            );
            data.add(imageQuestion412);

            String[] options413 = {
                    "Is not a sport","Ski","Surfing","Bobsleigh"
            };
            PreguntaConImagen imageQuestion413 = new PreguntaConImagen(
                    "http://iws.mev.hr/obadiclea/wp-content/uploads/2016/06/bobsleigh.jpg",
                    Constant.TYPE_DEPORTE,
                    options413,
                    "Bobsleigh"
            );
            data.add(imageQuestion413);

            String[] options2 = {
                    "Fuleco","Ato","Naranjito","Zakumi"
            };

            PreguntaConImagen imageQuestion2 = new PreguntaConImagen(
                    "https://upload.wikimedia.org/wikipedia/en/thumb/8/8f/Zakumi.svg/870px-Zakumi.svg.png",
                    Constant.TYPE_DEPORTE,
                    options2,
                    "Zakumi"
            );

            data.add(imageQuestion2);

            String[] options3 = {
                    "Signal Iduna Park","Allianz Arena","Santiago Bernabeu","Camp Nou"
            };

            PreguntaConImagen imageQuestion3 = new PreguntaConImagen(
                    "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcRYA0Q5MNmJif7q6KtQh3HGmf5zPQdTKREnxlvdR80zFaySmMfkcw",
                    Constant.TYPE_DEPORTE,
                    options3,
                    "Signal Iduna Park"
            );

            data.add(imageQuestion3);

            String[] options4 = {
                    "Ato","Ciao","Sakumi","Fuleco"
            };

            PreguntaConImagen imageQuestion4 = new PreguntaConImagen(
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRxCgS4XluYyON0ArPuHJU-H1JTQ2g2uzOdZ8YyX4WEdfpbI96I",
                    Constant.TYPE_DEPORTE,
                    options4,
                    "Ciao"
            );

            data.add(imageQuestion4);

            String[] options5= {
                    "Milan","Inter","Juventus","Napoli"
            };

            PreguntaConImagen imageQuestion5= new PreguntaConImagen(
                    "http://4.bp.blogspot.com/-E5A7wsfG4FM/VhUwkLM5dSI/AAAAAAAAx2g/L960dSH5I8Q/s1600/AC%2BMilan%2B512x512%2BPESLogos.png",
                    Constant.TYPE_DEPORTE,
                    options5,
                    "Milan"
            );

            data.add(imageQuestion5);

            //endregion

            //region PREGUNTA 360
            String[] options360 = {
                    "Nicklaus Tintiger","Joachim Loew","Sepp Herberger","Franz Beckenbauer"
            };
            PreguntaConImagen imageQuestion360 = new PreguntaConImagen(
                    "https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcQ-dD2B_9Z5jnpJqz8P4Iq9MD-CQfQP700hx-ItBcbnFvGvERqR",
                    Constant.TYPE_DEPORTE,
                    options360,
                    "Joachim Loew"
            );
            data.add(imageQuestion360);
            //endregion

            //region PREGUNTA 361
            String[] options361= {
                    "Urs Fischer","Bernhard Heusler","Luca Zuffi","Fabian Schaer"
            };
            PreguntaConImagen imageQuestion361 = new PreguntaConImagen(
                    "http://www.srf.ch/var/storage/images/auftritte/sport/bilder/2014/10/20/fabian_schaer/72244938-2-ger-DE/fabian_schaer_span12.jpg",
                    Constant.TYPE_DEPORTE,
                    options361,
                    "Fabian Schaer"
            );
            data.add(imageQuestion361);
            //endregion

            //region PREGUNTA 362
            String[] options362= {
                    "Letzigrund","St. Jakob Park","AFG Arena","None of above"
            };
            PreguntaConImagen imageQuestion362= new PreguntaConImagen(
                    "http://www.gazzetta.gr/sites/default/files/sitefiles_2016-05/4a9d0d5a4a7f1d87ce77d6a7bbba7261.jpg",
                    Constant.TYPE_DEPORTE,
                    options362,
                    "St. Jakob Park"
            );
            data.add(imageQuestion362);
            //endregion




        }

        else {

            String[] opciones1 = {
                    "Celta de Vigo","Malaga","Cruz Azul","Cuy sabor"
            };

            PreguntaConImagen preguntaConImagen1 = new PreguntaConImagen(
                    "https://www.ecured.cu/images/thumb/f/f9/Escudo-del-real-club-celta-de-vigo-deportes-escudos-de-futbol-pintado-por-martinb-9769932.jpg/260px-Escudo-del-real-club-celta-de-vigo-deportes-escudos-de-futbol-pintado-por-martinb-9769932.jpg",
                    Constant.TYPE_DEPORTE,
                    opciones1,
                    "Celta de Vigo"
            );
            data.add(preguntaConImagen1);

            //region PREGUNTA 360
            String[] opciones360 = {
                    "Nicklaus Tintiger","Joachim Loew","Sepp Herberger","Franz Beckenbauer"
            };
            PreguntaConImagen preguntaConImagen360 = new PreguntaConImagen(
                    "https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcQ-dD2B_9Z5jnpJqz8P4Iq9MD-CQfQP700hx-ItBcbnFvGvERqR",
                    Constant.TYPE_DEPORTE,
                    opciones360,
                    "Joachim Loew"
            );
            data.add(preguntaConImagen360);
            //endregion

            //region PREGUNTA 361
            String[] opciones361= {
                    "Urs Fischer","Bernhard Heusler","Luca Zuffi","Fabian Schaer"
            };
            PreguntaConImagen preguntaConImagen361 = new PreguntaConImagen(
                    "http://www.srf.ch/var/storage/images/auftritte/sport/bilder/2014/10/20/fabian_schaer/72244938-2-ger-DE/fabian_schaer_span12.jpg",
                    Constant.TYPE_DEPORTE,
                    opciones361,
                    "Fabian Schaer"
            );
            data.add(preguntaConImagen361);
            //endregion

            //region PREGUNTA 362
            String[] opciones362= {
                    "Letzigrund","St. Jakob Park","AFG Arena","Ninguna de las anteriores"
            };
            PreguntaConImagen preguntaConImagen362= new PreguntaConImagen(
                    "http://www.gazzetta.gr/sites/default/files/sitefiles_2016-05/4a9d0d5a4a7f1d87ce77d6a7bbba7261.jpg",
                    Constant.TYPE_DEPORTE,
                    opciones362,
                    "St. Jakob Park"
            );
            data.add(preguntaConImagen362);
            //endregion


            //region PREGUNTAS
            String[] opciones2 = {
                    "Fuleco","Ato","Naranjito","Zakumi"
            };

            PreguntaConImagen preguntaConImagen2 = new PreguntaConImagen(
                    "https://upload.wikimedia.org/wikipedia/en/thumb/8/8f/Zakumi.svg/870px-Zakumi.svg.png",
                    Constant.TYPE_DEPORTE,
                    opciones2,
                    "Zakumi"
            );
            data.add(preguntaConImagen2);

            String[] opciones3 = {
                    "Signal Iduna Park","Allianz Arena","Santiago Bernabeu","Camp Nou"
            };

            PreguntaConImagen preguntaConImagen3 = new PreguntaConImagen(
                    "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcRYA0Q5MNmJif7q6KtQh3HGmf5zPQdTKREnxlvdR80zFaySmMfkcw",
                    Constant.TYPE_DEPORTE,
                    opciones3,
                    "Signal Iduna Park"
            );
            data.add(preguntaConImagen3);

            String[] opciones4 = {
                    "Ato","Ciao","Sakumi","Fuleco"
            };

            PreguntaConImagen preguntaConImagen4= new PreguntaConImagen(
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRxCgS4XluYyON0ArPuHJU-H1JTQ2g2uzOdZ8YyX4WEdfpbI96I",
                    Constant.TYPE_DEPORTE,
                    opciones4,
                    "Ciao"
            );
            data.add(preguntaConImagen4);

            String[] opciones5= {
                    "Milan","Inter","Juventus","Napoli"
            };

            PreguntaConImagen preguntaconImagen5= new PreguntaConImagen(
                    "http://4.bp.blogspot.com/-E5A7wsfG4FM/VhUwkLM5dSI/AAAAAAAAx2g/L960dSH5I8Q/s1600/AC%2BMilan%2B512x512%2BPESLogos.png",
                    Constant.TYPE_DEPORTE,
                    opciones5,
                    "Milan"
            );

            data.add(preguntaconImagen5);

            //endregion
        }
        return data;
    }
    public List<PreguntaConImagen> getPreguntasConImagenSociales(){
        List<PreguntaConImagen> data = new ArrayList<>();

        if (isEnglish){

            //region PREGUNTAS
            String[] options1 = {
                    "Philipins","Puerto Rico","Dominican Republic","Vietnam"
            };

            PreguntaConImagen imageQuestion1 = new PreguntaConImagen(
                    "http://vignette4.wikia.nocookie.net/worldmusicfestival/images/1/17/Filipinas_Flag_Bandera.jpg/revision/latest?cb=20140710180135",
                    Constant.TYPE_SOCIALES,
                    options1,
                    "Philipins"
            );

            data.add(imageQuestion1);

            String[] options2 = {
                    "Wales","Gibraltar","Republic of Malta","Papua New Guinea"
            };

            PreguntaConImagen imageQuestion2 = new PreguntaConImagen(
                    "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcSrWypLa1zsQIZBiMzNCgU7ff7TqHlmWAHtYwdrraFNz7LgEeH-",
                    Constant.TYPE_SOCIALES,
                    options2,
                    "Gibraltar"
            );

            data.add(imageQuestion2);

            String[] options3 = {
                    "Gulf of Alaska","Gulf of Mexico","Lower California Peninsula","Gulf of California"
            };

            PreguntaConImagen imageQuestion3 = new PreguntaConImagen(
                    "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcQU2HT1uP5xHbWnd50xt4Tt5zJecGQuLcf6MSeiiOWW91vljkJ-Xg",
                    Constant.TYPE_SOCIALES,
                    options3,
                    "Gulf of Mexico"
            );

            data.add(imageQuestion3);

            String[] options4 = {
                    "Taj Mahal, India","Golden Temple, Japan","The Colosseum, Italy","Golden Temple, India"
            };

            PreguntaConImagen imageQuestion4 = new PreguntaConImagen(
                    "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcRV1k14kARZmBii04GIJwyeMMKqzCsTnCRMur67GCouklRY7ycu",
                    Constant.TYPE_SOCIALES,
                    options4,
                    "Golden Temple, India"
            );

            data.add(imageQuestion4);

            String[] options5 = {
                    "Pasto","Popayan","Bogota","Cali"
            };

            PreguntaConImagen imageQuestion5 = new PreguntaConImagen(
                    "https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcSu51JXTsJY3OrMLAs9wGXgCoCS3vXegdPnBcLWKDSBBwf5g-sj-A",
                    Constant.TYPE_SOCIALES,
                    options5,
                    "Bogota"
            );

            data.add(imageQuestion5);

            String[] options421 = {
                    "Saudi Arabia","Iran","Yemen","India"
            };
            PreguntaConImagen imageQuestion421 = new PreguntaConImagen(
                    "http://mapamundial.co/geografia/situacion-geografica-de-arabia-saudita.jpg",
                    Constant.TYPE_SOCIALES,
                    options421,
                    "Saudi Arabia"
            );
            data.add(imageQuestion421);

            String[] options422 = {
                    "Rio Claro","La Paz","Las Lajas","Juanambu"
            };
            PreguntaConImagen imageQuestion422 = new PreguntaConImagen(
                    "https://upload.wikimedia.org/wikipedia/commons/a/a6/Santuario_Nacional_de_Las_Lajas_02.jpg",
                    Constant.TYPE_SOCIALES,
                    options422,
                    "Las Lajas"
            );
            data.add(imageQuestion422);

            String[] options423 = {
                    "Simon Bolivar","Jose Mutis","Julio Garavito","Francisco J. Caldas"
            };
            PreguntaConImagen imageQuestion423 = new PreguntaConImagen(
                    "http://www.biografiasyvidas.com/biografia/c/fotos/caldas_francisco_jose.jpg",
                    Constant.TYPE_SOCIALES,
                    options423,
                    "Francisco J. Caldas"
            );
            data.add(imageQuestion423);

            //endregion

            //region PREGUNTA 370
            String[] options370 = {
                    "Castell humà","Castellers","Pinyes d'homes","None of the above"
            };
            PreguntaConImagen imageQuestion370= new PreguntaConImagen(
                    "http://ep01.epimg.net/cat/imagenes/2016/10/02/catalunya/1475403770_457201_1475434351_noticia_fotograma.jpg",
                    Constant.TYPE_SOCIALES,
                    options370,
                    "Castellers"
            );
            data.add(imageQuestion370);
            //endregion

            //region PREGUNTA 371
            String[] options371 = {
                    "Chelmno","None of above","Rumbula","Arbeitsdorf","Sachsenhausen"
            };
            PreguntaConImagen imageQuestion371= new PreguntaConImagen(
                    "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcSjnYWBb5QiIoHL5fKsMdiMSW59_urvT0zd74D_zysqpWZ9bmSO",
                    Constant.TYPE_SOCIALES,
                    options371,
                    "None of above"
            );
            data.add(imageQuestion371);
            //endregion

            //region PREGUNTA 372
            String[] options372 = {
                    "Nefertiti","Cleopatra","Nitocris","Meryt-Neit"
            };
            PreguntaConImagen imageQuestion372= new PreguntaConImagen(
                    "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcRB5xk8lV4a_2oi4TTauGiB4d3hvMnBTVSeEzXkywabqe7SuxSQ",
                    Constant.TYPE_SOCIALES,
                    options372,
                    "Nefertiti"
            );
            data.add(imageQuestion372);
            //endregion

        }

        else {

            //region PREGUNTAS
            String[] opciones1 = {
                    "Filipinas","Puerto Rico","Republica Dominicana","Vietnam"
            };

            PreguntaConImagen preguntaConImagen1 = new PreguntaConImagen(
                    "http://vignette4.wikia.nocookie.net/worldmusicfestival/images/1/17/Filipinas_Flag_Bandera.jpg/revision/latest?cb=20140710180135",
                    Constant.TYPE_SOCIALES,
                    opciones1,
                    "Filipinas"
            );
            data.add(preguntaConImagen1);

            String[] opciones421 = {
                    "Arabia Saudita","Iran","Yemen","India"
            };
            PreguntaConImagen preguntaConImagen421 = new PreguntaConImagen(
                    "http://mapamundial.co/geografia/situacion-geografica-de-arabia-saudita.jpg",
                    Constant.TYPE_SOCIALES,
                    opciones421,
                    "Arabia Saudita"
            );
            data.add(preguntaConImagen421);

            String[] opciones422 = {
                    "Rio Claro","La Paz","Las Lajas","Juanambu"
            };
            PreguntaConImagen preguntaConImagen422 = new PreguntaConImagen(
                    "https://upload.wikimedia.org/wikipedia/commons/a/a6/Santuario_Nacional_de_Las_Lajas_02.jpg",
                    Constant.TYPE_SOCIALES,
                    opciones422,
                    "Las Lajas"
            );
            data.add(preguntaConImagen422);

            String[] opciones423 = {
                    "Simón Bolívar","José Mutis","Julio Garavito","Francisco J. Caldas"
            };
            PreguntaConImagen preguntaConImagen423 = new PreguntaConImagen(
                    "http://www.biografiasyvidas.com/biografia/c/fotos/caldas_francisco_jose.jpg",
                    Constant.TYPE_SOCIALES,
                    opciones423,
                    "Francisco J. Caldas"
            );
            data.add(preguntaConImagen423);
            //endregion

            //region PREGUNTA 370
            String[] opciones370 = {
                    "Castell humà","Castellers","Pinyes d'homes","Niguna de las anteriores"
            };
            PreguntaConImagen preguntaConImagen370= new PreguntaConImagen(
                    "http://ep01.epimg.net/cat/imagenes/2016/10/02/catalunya/1475403770_457201_1475434351_noticia_fotograma.jpg",
                    Constant.TYPE_SOCIALES,
                    opciones370,
                    "Castellers"
            );
            data.add(preguntaConImagen370);
            //endregion

            //region PREGUNTA 371
            String[] opciones371 = {
                    "Chelmno","Ninguna de las anteriores","Rumbula","Arbeitsdorf","Sachsenhausen"
            };
            PreguntaConImagen preguntaConImagen371= new PreguntaConImagen(
                    "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcSjnYWBb5QiIoHL5fKsMdiMSW59_urvT0zd74D_zysqpWZ9bmSO",
                    Constant.TYPE_SOCIALES,
                    opciones371,
                    "Ninguna de las anteriores"
            );
            data.add(preguntaConImagen371);
            //endregion

            //region PREGUNTA 372
            String[] opciones372 = {
                    "Nefertiti","Cleopatra","Nitocris","Meryt-Neit"
            };
            PreguntaConImagen preguntaConImagen372= new PreguntaConImagen(
                    "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcRB5xk8lV4a_2oi4TTauGiB4d3hvMnBTVSeEzXkywabqe7SuxSQ",
                    Constant.TYPE_SOCIALES,
                    opciones372,
                    "Nefertiti"
            );
            data.add(preguntaConImagen372);
            //endregion

            //region MAS PREGUNTAS
            String[] opciones2 = {
                    "Gales","Gibraltar","Republica de Malta","Papua Nueva Guinea"
            };

            PreguntaConImagen preguntaConImagen2 = new PreguntaConImagen(
                    "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcSrWypLa1zsQIZBiMzNCgU7ff7TqHlmWAHtYwdrraFNz7LgEeH-",
                    Constant.TYPE_SOCIALES,
                    opciones2,
                    "Gibraltar"
            );

            data.add(preguntaConImagen2 );

            String[] opciones3 = {
                    "Golfo de Alaska","Golfo de Mexico","Peninsula de la baja California","Golfo de California"
            };

            PreguntaConImagen preguntaConImagen3 = new PreguntaConImagen(
                    "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcQU2HT1uP5xHbWnd50xt4Tt5zJecGQuLcf6MSeiiOWW91vljkJ-Xg",
                    Constant.TYPE_SOCIALES,
                    opciones3,
                    "Golfo de Mexico"
            );

            data.add(preguntaConImagen3);

            String[] opciones4 = {
                    "Taj Mahal, India","Templo dorado, Japon","El coliseo, Italia","Templo dorado, India"
            };

            PreguntaConImagen preguntaConImagen4 = new PreguntaConImagen(
                    "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcRV1k14kARZmBii04GIJwyeMMKqzCsTnCRMur67GCouklRY7ycu",
                    Constant.TYPE_SOCIALES,
                    opciones4,
                    "Templo dorado, India"
            );

            data.add(preguntaConImagen4);

            String[] opciones5 = {
                    "Pasto","Popayán","Bogotá","Calí"
            };

            PreguntaConImagen preguntaConImagen5 = new PreguntaConImagen(
                    "https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcSu51JXTsJY3OrMLAs9wGXgCoCS3vXegdPnBcLWKDSBBwf5g-sj-A",
                    Constant.TYPE_SOCIALES,
                    opciones5,
                    "Bogotá"
            );

            data.add(preguntaConImagen5);
            //endregion
        }

        return data;
    }

    public List<PreguntaConImagen> getPreguntasConImagenArtes(){
        List<PreguntaConImagen> data = new ArrayList<>();

        if (isEnglish){

            //region PREGUNTAS
            String[] options1 = {
                    "Chimera","Minotaur","Centaur","Griffin"
            };

            PreguntaConImagen imageQuestion1 = new PreguntaConImagen(
                    "http://vignette1.wikia.nocookie.net/el-bestiario/images/0/06/Quimera.jpg/revision/latest?cb=20141011201106&path-prefix=es",
                    Constant.TYPE_ARTES,
                    options1,
                    "Chimera"
            );

            data.add(imageQuestion1);



            String[] options2 = {
                    "Guitar","Bass","Bandola","Ukelele"
            };

            PreguntaConImagen imageQuestion2 = new PreguntaConImagen(
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSLD99rTyZA_S7W4vLJKlLKWBcO3ux5QO3TDzCigY0vrIj1wVKnYQ",
                    Constant.TYPE_ARTES,
                    options2,
                    "Bass"
            );
            data.add(imageQuestion2);

            String[] options3 = {
                    "G-clef","C-clef","F-clef","M-clef"
            };

            PreguntaConImagen imageQuestion3 = new PreguntaConImagen(
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT23I_3pBwi2y5FsShFM0ROUAbFTGT8Ck1QCNG69BhQAn88EwdYJA",
                    Constant.TYPE_ARTES,
                    options3,
                    "C-clef"
            );
            data.add(imageQuestion3);

            String[] options4 = {
                    "Gioconda","The Persistence of Memory","The Starry Night","The Scream"
            };

            PreguntaConImagen imageQuestion4 = new PreguntaConImagen(
                    "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSH6ZomqF3mJ_rb6LGEAhjuZu1aYXEoDS3kN2DlG9X_MNIASSvxtw",
                    Constant.TYPE_ARTES,
                    options4,
                    "The Scream"
            );
            data.add(imageQuestion4);

            String[] options5 = {
                    "Pablo Picasso", "Fernando Botero", "Alejandro Obregon","Salvador Dali"
            };

            PreguntaConImagen imageQuestion5 = new PreguntaConImagen(
                    "https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcSDsOD9jyTD55lf5bvvqteLBVUxTFEwwKAWJ8VVxKb3Vwxwiyzs",
                    Constant.TYPE_ARTES,
                    options5,
                    "Salvador Dali"
            );
            data.add(imageQuestion5);

            String[] options431 = {
                    "Oboe","Charango","Four","Treble"
            };
            PreguntaConImagen imageQuestion431 = new PreguntaConImagen(
                    "https://makingmulticulturalmusic.files.wordpress.com/2013/03/charango-full-color-image-e1363116667672.jpg",
                    Constant.TYPE_ARTES,
                    options431,
                    "Charango"
            );
            data.add(imageQuestion431);

            String[] options432 = {
                    "Carlos Villagran","Charles Chaplin","Roberto Bolaños","Cantinflas"
            };
            PreguntaConImagen imageQuestion432 = new PreguntaConImagen(
                    "http://elvasomediolleno.guru/wp-content/uploads/2015/05/Charles-Chaplin.jpg",
                    Constant.TYPE_ARTES,
                    options432,
                    "Charles Chaplin"
            );
            data.add(imageQuestion432);

            String[] options433 = {
                    "Rafael","Miguel Angel","Donatelo","Leonardo Da Vinci"
            };
            PreguntaConImagen imageQuestion433 = new PreguntaConImagen(
                    "http://3.bp.blogspot.com/-LA3mZNUX0HE/VP3yMoO-8-I/AAAAAAAADno/VuZM_1nts2M/s1600/Miguel_%C3%81ngel,%2BCreacion%2Bde%2BAdan.jpg",
                    Constant.TYPE_ARTES,
                    options433,
                    "Miguel Angel"
            );
            data.add(imageQuestion433);
            //endregion

            //region PREGUNTA 340
            String[] options340 = {
                    "Sofia Nix","Franceska Jaimes","Melanie Rios","Jueputa que rico"
            };

            PreguntaConImagen imageQuestion340= new PreguntaConImagen(
                    "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcTP1qwFfhAYVK9MWn9WufUNUQcTxht_mUXFto6MvUDXqB7c3hmfeQ",
                    Constant.TYPE_ARTES,
                    options340,
                    "Jueputa que rico"
            );
            data.add(imageQuestion340);
            //endregion

            //region PREGUNTA 341
            String[] options341= {
                    "Edvard Munch","Francisco de Goya","Miguel Angel","Gustav Klimt"
            };
            PreguntaConImagen imageQuestion341 = new PreguntaConImagen(
                    "https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcQeMldd8FV4Sveitwm1ojZpisNgKyewUeVynYopwIRpLtCHk0HY",
                    Constant.TYPE_ARTES,
                    options341,
                    "Edvard Munch"
            );
            data.add(imageQuestion341);
            //endregion

            //region PREGUNTA 342
            String[] options342= {
                    "Tiziano","Miró","Degas","Rubens"
            };
            PreguntaConImagen imageQuestion342 = new PreguntaConImagen(
                    "https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcQDYjitaVmC5Y8fAEB-8e81hUqBPyaMNESy1A3dg0jNjirRzVGk4w",
                    Constant.TYPE_ARTES,
                    options342,
                    "Miró"
            );
            data.add(imageQuestion342);
            //endregion
        }

        else {

            //region PREGUNTAS

            String[] opciones1 = {
                    "Quimera","Minotauro","Grifo","Centauro"
            };

            String[] opciones431 = {
                    "Oboe","Cuatro","Charango","Tiple"
            };
            PreguntaConImagen preguntaConImagen431 = new PreguntaConImagen(
                    "https://makingmulticulturalmusic.files.wordpress.com/2013/03/charango-full-color-image-e1363116667672.jpg",
                    Constant.TYPE_ARTES,
                    opciones431,
                    "Charango"
            );
            data.add(preguntaConImagen431);

            String[] opciones432 = {
                    "Carlos Villagran","Roberto Bolaños","Charles Chaplin","Cantinflas"
            };
            PreguntaConImagen preguntaConImagen432 = new PreguntaConImagen(
                    "http://elvasomediolleno.guru/wp-content/uploads/2015/05/Charles-Chaplin.jpg",
                    Constant.TYPE_ARTES,
                    opciones432,
                    "Charles Chaplin"
            );
            data.add(preguntaConImagen432);

            String[] opciones433 = {
                    "Rafael","Miguel Ángel","Donatelo","Leonardo Da Vinci"
            };
            PreguntaConImagen preguntaConImagen433 = new PreguntaConImagen(
                    "http://3.bp.blogspot.com/-LA3mZNUX0HE/VP3yMoO-8-I/AAAAAAAADno/VuZM_1nts2M/s1600/Miguel_%C3%81ngel,%2BCreacion%2Bde%2BAdan.jpg",
                    Constant.TYPE_ARTES,
                    opciones433,
                    "Miguel Ángel"
            );
            data.add(preguntaConImagen433);

            PreguntaConImagen preguntaConImagen1 = new PreguntaConImagen(
                    "http://vignette1.wikia.nocookie.net/el-bestiario/images/0/06/Quimera.jpg/revision/latest?cb=20141011201106&path-prefix=es",
                    Constant.TYPE_ARTES,
                    opciones1,
                    "Quimera"
            );
            data.add(preguntaConImagen1);






            String[] opciones2 = {
                    "Guitarra","Bajo","Bandola","Ukelele"
            };

            PreguntaConImagen preguntaConImagen2 = new PreguntaConImagen(
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSLD99rTyZA_S7W4vLJKlLKWBcO3ux5QO3TDzCigY0vrIj1wVKnYQ",
                    Constant.TYPE_ARTES,
                    opciones2,
                    "Bajo"
            );
            data.add(preguntaConImagen2);

            String[] opciones3 = {
                    "Clave de Sol","Clave de Fa","Clave de Do","Clave de Mi"
            };

            PreguntaConImagen preguntaConImagen3 = new PreguntaConImagen(
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT23I_3pBwi2y5FsShFM0ROUAbFTGT8Ck1QCNG69BhQAn88EwdYJA",
                    Constant.TYPE_ARTES,
                    opciones3,
                    "Clave de Do"
            );
            data.add(preguntaConImagen3);
            String[] opciones4 = {
                    "La noche estrellada","El grito","Gioconda","La persistencia de la memoria"
            };

            PreguntaConImagen preguntaConImagen4 = new PreguntaConImagen(
                    "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSH6ZomqF3mJ_rb6LGEAhjuZu1aYXEoDS3kN2DlG9X_MNIASSvxtw",
                    Constant.TYPE_ARTES,
                    opciones4,
                    "El grito"
            );
            data.add(preguntaConImagen4);

            String[] opciones5 = {
                    "Pablo Picasso", "Fernando Botero", "Alejandro Obregón","Salvador Dalí"
            };

            PreguntaConImagen preguntaConImagen5 = new PreguntaConImagen(
                    "https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcSDsOD9jyTD55lf5bvvqteLBVUxTFEwwKAWJ8VVxKb3Vwxwiyzs",
                    Constant.TYPE_ARTES,
                    opciones5,
                    "Salvador Dalí"
            );
            data.add(preguntaConImagen5);
            //endregion

            //region PREGUNTA 340
            String[] opciones340 = {
                    "Sofia Nix","Franceska Jaimes","Melanie Rios","Jueputa que rico"
            };

            PreguntaConImagen preguntaConImagen340 = new PreguntaConImagen(
                    "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcTP1qwFfhAYVK9MWn9WufUNUQcTxht_mUXFto6MvUDXqB7c3hmfeQ",
                    Constant.TYPE_ARTES,
                    opciones340,
                    "Jueputa que rico"
            );
            data.add(preguntaConImagen340);
            //endregion

            //region PREGUNTA 341
            String[] opciones341= {
                    "Edvard Munch","Francisco de Goya","Miguel Angel","Gustav Klimt"
            };
            PreguntaConImagen preguntaConImagen341 = new PreguntaConImagen(
                    "https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcQeMldd8FV4Sveitwm1ojZpisNgKyewUeVynYopwIRpLtCHk0HY",
                    Constant.TYPE_ARTES,
                    opciones341,
                    "Edvard Munch"
            );
            data.add(preguntaConImagen341);
            //endregion

            //region PREGUNTA 342
            String[] opciones342= {
                    "Tiziano","Miró","Degas","Rubens"
            };
            PreguntaConImagen preguntaConImagen342 = new PreguntaConImagen(
                    "https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcQDYjitaVmC5Y8fAEB-8e81hUqBPyaMNESy1A3dg0jNjirRzVGk4w",
                    Constant.TYPE_ARTES,
                    opciones342,
                    "Miró"
            );
            data.add(preguntaConImagen342);
            //endregion


        }

        return data;
    }


    public PreguntaConImagen getRandomPreguntaConImagen(List<PreguntaConImagen> data){
        Random rand = new Random();
        int  n = rand.nextInt(data.size());
        return data.get(n);
    }
}
