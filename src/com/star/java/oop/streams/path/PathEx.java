package com.star.java.oop.streams.path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PathEx {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/home/ionut/workspace/trainings/star-training/src");
        System.out.println("Path: " + path);
        System.out.println("isAbsolute: " + path.isAbsolute());
        System.out.println("parent: " + path.getParent());
        System.out.println(path.getFileName());
        System.out.println(path.getNameCount());  //7
        System.out.println(path.getName(4));
        System.out.println(path.getRoot());

//        Files contine un set de operatii utile pentru manipularea fisierelor/folderelor
        Stream<Path> pathStream = Files.walk(path, 1); //list e ca walk cu adancime 1
        pathStream
            //                .filter(path1 -> Files.isDirectory(path1))
            //                  .filter(path1 -> path1.toString().endsWith(".java"))
            .forEach(System.out::println);

        String gitignoreContent = Files.lines(Paths.get("/home/ionut/workspace/trainings/star-training/.gitignore")) //Stream<String> cu liniile fisierului
                                       .collect(Collectors.joining("\n"));

        System.out.println(gitignoreContent);


    }

}
