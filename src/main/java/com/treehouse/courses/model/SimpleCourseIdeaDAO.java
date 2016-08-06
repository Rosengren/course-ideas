package com.treehouse.courses.model;

import java.util.ArrayList;
import java.util.List;

/**
 * IMPORTANT: Never use in-memory data storage like the one
 * used in this DAO. This is bad practice and is only being
 * used for testing/prototyping purposes.
 */
public class SimpleCourseIdeaDAO implements CourseIdeaDAO {

    private List<CourseIdea> ideas;

    public SimpleCourseIdeaDAO() {
        ideas = new ArrayList<>();
    }

    @Override
    public boolean add(CourseIdea idea) {
        return ideas.add(idea);
    }

    @Override
    public List<CourseIdea> findAll() {
        return new ArrayList<>(ideas);
    }
}
