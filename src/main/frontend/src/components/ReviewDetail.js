import React from 'react';
import './review.css'

const ReviewDetail = () => {
    return (
        <div class="container">
            <h2>게시글 상세 화면</h2>
            <form id="frm" method="POST">
                <table class="board_detail">
                    <colgroup>
                        <col width="15%" />
                        <col width="35%" />
                        <col width="15%" />
                        <col width="35%" />
                    </colgroup>
                    <caption>게시글 상세 내용</caption>
                    <tbody>
                        <tr>
                            <th scope="row">글 번호</th>
                            <td></td>
                            <th scope="row">조회수</th>
                            <td></td>
                        </tr>
                        <tr>
                            <th scope="row">작성자</th>
                            <td></td>
                            <th scope="row">작성일</th>
                            <td></td>
                        </tr>
                        <tr>
                            <th scope="row">제목</th>
                            <td colspan="3">
                                <input type="text" id="title" name="title" />
                            </td>
                        </tr>
                        <tr>
                            <td colspan="4" class="view_text">
                                <textarea name="contents" id="contents" title="내용" ></textarea>
                            </td>
                        </tr>
                    </tbody>
                </table>
                <input type="hidden" name="boardIdx" />
                <input type="hidden" id="method" name="_method" />
            </form>
            <div class="file_list" >
              
            </div>
            <input type="button" id="list" value="목록으로" />
            <input type="button" id="edit" value="수정하기" />
            <input type="button" id="delete" value="삭제하기" />
        </div>
    );
}

export default ReviewDetail;