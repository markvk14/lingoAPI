package com.project.wordGenerator.application;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IFilterFileService {
    List<String> getFilteredList();
}
