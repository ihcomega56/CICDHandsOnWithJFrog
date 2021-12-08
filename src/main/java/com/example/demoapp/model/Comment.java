package com.example.demoapp.model;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 発言を管理するクラス
 */
public class Comment {
    public Comment(long id, String text) {
        this.text = text;
    }

    /**
     * 発言をそっくりそのまま返す
     * @return 元の発言
     */
    public String echo() {
        // TODO: テストが通るようコードを修正する
        return "勝手な発言";
        // ↑の1行を以下のコードに置き換えればOK
        // return text;
    }

    /**
     * 発言を指定した回数繰り返す
     * @param time 回数
     * @return 回数分繰り返された発言
     */
    public String repeat(int time) {
        return IntStream.range(0, time).mapToObj(i -> text).collect(Collectors.joining());
    }

    private final String text;
}
