package com.example.zerobase.domain;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

enum Status{
    IN_PROGRESS,OPEN,CLOSE;
}

@Data
public class ZerobaseCourse {
    private Long courseId;

    private String courseName;

    private String courseLogo;

    Status in_progress;
    Status open;
    Status close;

    //private String status;

    private LocalDate startAt;

    private LocalDate endAt;

    private boolean hidden;

    @Builder
    public ZerobaseCourse(Long courseId, String courseName, Status in_progress, Status open, Status close, LocalDate startAt, LocalDate endAt, boolean hidden) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.in_progress = in_progress;
        this.open = open;
        this.close = close;
        //this.status = status;
        this.startAt = startAt;
        this.endAt = endAt;
        this.hidden = hidden;
    }
}
