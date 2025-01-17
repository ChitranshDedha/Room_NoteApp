package com.DCoding.roomdatabase.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rX\u0082\u000e\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0019"}, d2 = {"Lcom/DCoding/roomdatabase/presentation/NotesViewModel;", "Landroidx/lifecycle/ViewModel;", "dao", "Lcom/DCoding/roomdatabase/data/NoteDao;", "(Lcom/DCoding/roomdatabase/data/NoteDao;)V", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/DCoding/roomdatabase/presentation/NoteState;", "get_state", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "isSortedByDateAdded", "", "notes", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lcom/DCoding/roomdatabase/data/Note;", "getNotes$annotations", "()V", "state", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "onEvent", "", "event", "Lcom/DCoding/roomdatabase/presentation/NotesEvent;", "app_debug"})
public final class NotesViewModel extends androidx.lifecycle.ViewModel {
    private final com.DCoding.roomdatabase.data.NoteDao dao = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> isSortedByDateAdded = null;
    private kotlinx.coroutines.flow.StateFlow<? extends java.util.List<com.DCoding.roomdatabase.data.Note>> notes;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.DCoding.roomdatabase.presentation.NoteState> _state = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.DCoding.roomdatabase.presentation.NoteState> state = null;
    
    public NotesViewModel(@org.jetbrains.annotations.NotNull
    com.DCoding.roomdatabase.data.NoteDao dao) {
        super();
    }
    
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.ExperimentalCoroutinesApi.class})
    @java.lang.Deprecated
    private static void getNotes$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<com.DCoding.roomdatabase.presentation.NoteState> get_state() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.DCoding.roomdatabase.presentation.NoteState> getState() {
        return null;
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull
    com.DCoding.roomdatabase.presentation.NotesEvent event) {
    }
}