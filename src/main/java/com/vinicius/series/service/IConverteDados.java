package com.vinicius.series.service;

public interface IConverteDados {
    <T> T  obterDados(String json, Class<T> classe);
}