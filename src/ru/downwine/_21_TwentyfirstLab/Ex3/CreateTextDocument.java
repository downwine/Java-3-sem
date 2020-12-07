package ru.downwine._21_TwentyfirstLab.Ex3;

public class CreateTextDocument implements IDocument {
    public IDocument CreateNew(){
        IDocument document = new IDocument() {};
        new TextDocument();
        return document;
    }
    public IDocument CreateOpen(){
        IDocument document = new IDocument() {};
        new TextDocument();
        return document;
    }
}
