package com.math.operations.demo.lib.facade;

import java.io.IOException;

public abstract class UseCase<T> {

    protected abstract T execute() throws IOException;
}