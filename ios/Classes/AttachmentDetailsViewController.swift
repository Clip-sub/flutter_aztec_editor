//
//  AttachmentDetailsViewController.swift
//  flutter_aztec_editor
//
//  Created by Quan Pham on 7/20/19.
//

import UIKit
import Aztec
import UIKit

class AttachmentDetailsViewController: UITableViewController {
    
    @IBOutlet var alignmentSegmentedControl : UISegmentedControl!
    @IBOutlet var sizeSegmentedControl : UISegmentedControl!
    @IBOutlet var sourceURLTextField: UITextField!
    @IBOutlet var linkURLTextField: UITextField!
    @IBOutlet var captionTextView: UITextView!
    @IBOutlet var altTextField: UITextField!
    
    var attachment: ImageAttachment?
    var caption: NSAttributedString?
    var linkURL: URL?
    var onUpdate: ((_ alignment: ImageAttachment.Alignment?, _ size: ImageAttachment.Size, _ imageURL: URL, _ linkURL: URL?, _ altText: String?, _ captionText: NSAttributedString?) -> Void)?
    var onDismiss: (() -> ())?

    override func viewDidLoad() {
        super.viewDidLoad()

        if let caption = caption {
            captionTextView.attributedText = caption
        }
        
        captionTextView.delegate = self
        
        title = NSLocalizedString("Properties", comment: "Attachment Properties Title")
    }

}

extension AttachmentDetailsViewController : UITextViewDelegate {
    func textView(_ textView: UITextView, shouldChangeTextIn range: NSRange, replacementText text: String) -> Bool {
        let containsBreakingCharacters = text.contains(where: { (character) -> Bool in
            guard let characterName = Character.Name(rawValue: character) else {
                return false
            }
            
            return Character.paragraphBreakingCharacters.contains(characterName)
        })
        
        return !containsBreakingCharacters
    }
}

private extension AttachmentDetailsViewController {
    typealias AttachmentAlignment = ImageAttachment.Alignment
}
