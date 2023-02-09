package com.ShraddhaChhanval.BrightBeginLibrary.services;

import com.ShraddhaChhanval.BrightBeginLibrary.models.Card;
import com.ShraddhaChhanval.BrightBeginLibrary.Enum.CardStatus;
import com.ShraddhaChhanval.BrightBeginLibrary.models.Student;
import com.ShraddhaChhanval.BrightBeginLibrary.repositories.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardService {

    @Autowired
    CardRepository cardRepository;

    public Card createAndReturn(Student student){
        Card card = new Card();
        card.setStudent(student);
        student.setCard(card);

        cardRepository.save(card);
        return card;
    }

    public void deactivateCard(int student_id){
        cardRepository.deactivateCard(student_id, CardStatus.DEACTIVATED.toString());
    }
}