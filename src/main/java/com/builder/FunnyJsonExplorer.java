package com.builder;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.cli.*;

import java.io.File;
import java.io.IOException;
// import java.io.FileInputStream;
// import java.util.Properties;

public class FunnyJsonExplorer {
    private JsonNode root;
    private void load(String filePath) throws IOException{
        ObjectMapper mapper=new ObjectMapper();
        this.root=mapper.readTree(new File(filePath));
    }
    public void show(String style,String icon){
        
        if(style.equals("tree")&&icon.equals("poker")){
            Builder builder1=new ConcreteBuilder1();
            Director director=new Director(builder1);
            Product product=director.construct();
            product.show(root);            
        }else if(style.equals("rectangle")&&icon.equals("weather")){
            Builder builder2=new ConcreteBuilder2();
            Director director=new Director(builder2);
            Product product=director.construct();
            product.show(root);
        }else{
            System.out.println("there is not such combination");
            return;
        }
    }

    private Options setOptions(){
        Options options=new Options();

        Option file=Option.builder("f")
                            .longOpt("file")
                            .hasArg()
                            .argName("filePath")
                            .desc("the path of json file")
                            // .required()
                            .build();
        Option style=Option.builder("s")
                            .longOpt("styleToVisual")
                            .hasArg()
                            .argName("style")
                            .desc("the style to visualize json file")
                            // .required()
                            .build();
        Option icon=Option.builder("i")
                            .longOpt("icon")
                            .hasArg()
                            .argName("iconFamily")
                            .desc("the icon family use in visualizing")
                            // .required()
                            .build();
        Option help=new Option("h","help",false,"the help of use");
        
        options.addOption(file);
        options.addOption(style);
        options.addOption(icon);
        options.addOption(help);

        return options;
    }

    public static void main(String[] args) throws IOException,ParseException{
        FunnyJsonExplorer fje=new FunnyJsonExplorer();
        Options options=fje.setOptions();

        CommandLineParser parser=new DefaultParser();
        CommandLine cmd=parser.parse(options, args);

        if(cmd.hasOption("h")){
            HelpFormatter formatter=new HelpFormatter();
            formatter.printHelp("fje", options);    
        }
        else{
            String filePath=cmd.getOptionValue("f");
            String styleToVisual=cmd.getOptionValue("s");
            String iconFamily=null;
            if(cmd.hasOption("i")){
                iconFamily=cmd.getOptionValue("i");
            }
            fje.load(filePath);
            fje.show(styleToVisual, iconFamily);
        }
    }
}

