import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddLikedSongComponent } from './add-liked-song.component';

describe('AddLikedSongComponent', () => {
  let component: AddLikedSongComponent;
  let fixture: ComponentFixture<AddLikedSongComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AddLikedSongComponent]
    });
    fixture = TestBed.createComponent(AddLikedSongComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
