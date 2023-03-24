package cn.bravedawn.design.pattern.behavioral.memento;

import java.util.Stack;

/**
 * @author : depers
 * @program : design_pattern
 * @description: 手记快照管理
 * @date : Created in 2020/12/10 22:00
 */
public class ArticleMementoManager {

    private final Stack<ArticleMemento> ARTICLE_MEMENTO_STACK = new Stack<ArticleMemento>();

    public ArticleMemento getMemento(){
        ArticleMemento articleMemento = ARTICLE_MEMENTO_STACK.pop();
        return articleMemento;
    }

    public void addMemento(ArticleMemento articleMemento){
        ARTICLE_MEMENTO_STACK.push(articleMemento);
    }

}
